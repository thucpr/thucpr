package test;

public class Test {

    public static void Question1() {

        // ở đây em đang sử dụng mỗi trường hợp một vòng lặp để tách ra cho rõ ràng ạ
        // nếu sử dụng cùng vòng lặp thì kết quả nó xen kẽ nhau ạ

        System.out.println("Question1 **********************************************" + "\n");

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Các số Chia hết cho 3 : " + "  " + i + "  " + "CMC");
            }
        }

        System.out.println("*******************************************************");

        for (int j = 1; j < 100; j++) {
            if (j % 5 == 0) {
                System.out.println("Các số Chia hết cho 5 : " + "  " + j + "  " + "GLOBAL");
            }
        }

        System.out.println("*******************************************************");

        for (int k = 1; k < 100; k++) {
            if (k % 15 == 0) {
                System.out.println("Các số Chia hết cho 15 : " + "  " + k + "  " + "CMC GLOBAL");
            }
        }

        System.out.println("*******************************************************");

        for (int h = 1; h < 100; h++) {
            if (h % 45 == 0) {
                System.out.println("Các số Chia hết cho 45 : " + "  " + h + "  " + "CMC PATH");
            }
        }

        System.out.println("\n");


    }


    public static void Question2() {

        // Sử dụng ScannerUtils để Validate Input number đầu vào ạ

        System.out.println("== Question2 ==========================================" + "\n");
        System.out.println("Input Number From  1 -> 3 : ");
        int n = ScannerUtils.inputInt();
        System.out.println("Input Number From 4 -> 6 : ");
        int n1 = ScannerUtils.inputInt2();
        System.out.println("Input Number From 7 -> 9 : ");
        int n2 = ScannerUtils.inputInt3();

        System.out.println("*******************************************************");

        if (n == 1) {
            for (int a = 1; a <= 9; a++) {
                System.out.println(String.format("%d * %d = %3d      %d * %d = %3d       %d * %d = %3d ", n, a, n * a, n + 1, a, (n + 1) * a, n + 2, a, (n + 2) * a));
            }
        }


        if (n == 2) {
            for (int b = 1; b <= 9; b++) {
                System.out.println(String.format("%d * %d = %3d      %d * %d = %3d       %d * %d = %3d ", n - 1, b, (n - 1) * b, n, b, n * b, n + 1, b, (n + 1) * b));
            }
        }

        if (n == 3) {
            for (int c = 1; c <= 9; c++) {
                System.out.println(String.format("%d * %d = %3d      %d * %d = %3d       %d * %d = %3d ", n - 2, c, (n - 2) * c, n - 1, c, (n - 1) * c, n, c, n * c));
            }
        }

        System.out.println("*******************************************************");


        if (n1 == 4) {
            for (int d = 1; d <= 9; d++) {
                System.out.println(String.format("%d * %d = %3d      %d * %d = %3d       %d * %d = %3d ", n1, d, n1 * d, n1 + 1, d, (n1 + 1) * d, n1 + 2, d, (n1 + 2) * d));
            }
        }

        if (n1 == 5) {
            for (int e = 1; e <= 9; e++) {
                System.out.println(String.format("%d * %d = %3d      %d * %d = %3d       %d * %d = %3d ", (n1 - 1), e, (n1 - 1) * e, n1, e, n1 * e, n1 + 1, e, (n1 + 1) * e));
            }
        }

        if (n1 == 6) {
            for (int f = 1; f <= 9; f++) {
                System.out.println(String.format("%d * %d = %3d      %d * %d = %3d       %d * %d = %3d ", n1 - 2, f, (n1 - 2) * f, n1 - 1, f, (n1 - 1) * f, n1, f, n1 * f));
            }
        }

        System.out.println("*******************************************************");

        if (n2 == 7) {
            for (int g = 1; g <= 9; g++) {
                System.out.println(String.format("%d * %d = %3d      %d * %d = %3d       %d * %d = %3d ", n2, g, n2 * g, n2 + 1, g, (n2 + 1) * g, n2 + 2, g, (n2 + 2) * g));
            }
        }


        if (n2 == 8) {
            for (int h = 1; h <= 9; h++) {
                System.out.println(String.format("%d * %d = %3d      %d * %d = %3d       %d * %d = %3d ", (n2 - 1), h, (n2 - 1) * h, n2, h, n2 * h, n2 + 1, h, (n2 + 1) * h));
            }
        }

            if (n2 == 9) {
                for (int k = 1; k <= 9; k++) {
                    System.out.println(String.format("%d * %d = %3d      %d * %d = %3d       %d * %d = %3d ", n2 - 2, k, (n2 - 2) * k, n2 - 1, k, (n2 - 1) * k, n2, k, n2 * k));
                }
            }

        }
    }
