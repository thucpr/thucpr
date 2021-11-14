package com.vti.specification;

import java.util.Date;

import javax.persistence.criteria.*;

import com.vti.entity.Account;
import org.springframework.data.jpa.domain.Specification;

import com.vti.entity.Department;

public class DepartmentSpecification implements Specification<Department> {

    private static final long serialVersionUID = 1L;

    private String field;
    private String operator;
    private Object value;

    public DepartmentSpecification(String field, String operator, Object value) {
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public Predicate toPredicate(Root<Department> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        if (operator.equalsIgnoreCase("LIKE")) {
            if (field.equalsIgnoreCase("author.fullName")) {
                return builder.like(root.get("author").get("fullName"), "%" + value.toString() + "%");
            } else {
                return builder.like(root.get(field), "%" + value.toString() + "%");
            }
        }

        if (operator.equalsIgnoreCase(">=")) {
            if (value instanceof Date) {
                return builder.greaterThanOrEqualTo(root.get(field), (Date) value);
            }
        }

        if (operator.equalsIgnoreCase("<=")) {
            if (value instanceof Date) {
                Date today = (Date) value;
                Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
                return builder.lessThanOrEqualTo(root.get(field), tomorrow);
            }
        }

        if (operator.equals("LIKE")) {
            return builder.like(root.get(field), "%" + value.toString() + "%");
        }
        if (operator.equalsIgnoreCase("author")) {
            Join<Department, Account> join1 = root.join("author", JoinType.LEFT);
            return builder.like(join1.get("username"), "%" + value.toString() + "%");
        }
        return null;
    }

}
