package test;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number >0 && number<=3) {
                    return number;
                }
                if (number < 0 || !(number >0 && number<=3)) {
                    System.out.println(" Please Input Number From 1->3");
                }
            } catch (Exception e) {
                System.err.println("Invalided Number Try Again");
            }
        }
    }

    public static int inputInt2() {
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number >3 && number<=6) {
                    return number;
                }
                if (number < 0 || !(number >3 && number<=6)) {
                    System.out.println(" Please Input Number From 4->6");
                }
            } catch (Exception e) {
                System.err.println("Invalided Number Try Again");
            }
        }
    }

    public static int inputInt3() {
        while (true) {
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number >6 && number<=9) {
                    return number;
                }
                if (number < 0 || !(number >6 && number<=9)) {
                    System.out.println(" Please Input Number From 7->9");
                }
            } catch (Exception e) {
                System.err.println("Invalided Number Try Again");
            }
        }
    }
}