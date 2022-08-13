package Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }

        }
        if (sumEven == sumOdd) {
            System.out.printf("Yes%nSum = %d", sumEven);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sumEven - sumOdd));
        }
    }
}
