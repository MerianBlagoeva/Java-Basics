package Exercises;

import jdk.dynalink.Operation;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        double result;
        String evenOrOdd = "odd";

        switch (operator) {
            case "+":
                result = n1 + n2;

                if (result % 2 == 0) {
                    evenOrOdd = "even";
                }
                System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOrOdd);
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                }
                System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOrOdd);
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                }
                System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOrOdd);
                break;
            case "/":
                if (n2 != 0) {
                    result = n1 / (n2 * 1.0);
                    System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
                } else {
                    System.out.printf("Cannot divide %d by zero", n1);
                }

                break;
            case "%":
                if (n2 != 0) {
                    result = n1 % n2;
                    System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);

                } else {
                    System.out.printf("Cannot divide %d by zero", n1);
                }


        }
    }

}
