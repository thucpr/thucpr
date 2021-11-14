package com.vti.dto;

public class AccountDto {

	private short id;

	private String fullName;

	private String username;

	private String FirstName;

	private  String lastName;

	public AccountDto(short id, String fullName, String username, String FirstName, String lastName) {
		this.id = id;
		this.fullName = fullName;
		this.username = username;
		this.FirstName = FirstName;
		this.lastName= lastName;

	}

	public short getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public String getUsername() {
		return username;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "AccountDto{" +
				", fullName='" + fullName + '\'' +
				", username='" + username + '\'' +
				", FirstName='" + FirstName + '\'' +
				", lastName='" + lastName + '\'' +
				'}';
	}

}
