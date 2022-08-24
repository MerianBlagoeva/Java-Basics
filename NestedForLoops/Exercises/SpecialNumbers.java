package Exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1111; i <= 9999; i++) {

            int firstDigit = i / 1000;
            int secondDigit = i / 100 % 10;
            int thirdDigit = i / 10 % 10;
            int forthDigit = i % 10;

            if (secondDigit > 0 &&
                thirdDigit > 0 &&
                forthDigit > 0) {
                if (n % firstDigit == 0 &&
                    n % secondDigit == 0 &&
                    n % thirdDigit == 0 &&
                    n % forthDigit == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
