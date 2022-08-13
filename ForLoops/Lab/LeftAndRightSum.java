package Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < n; i++) {
            int left = Integer.parseInt(sc.nextLine());
            sumLeft += left;
        }
        for (int i = 0; i < n; i++) {
            int right = Integer.parseInt(sc.nextLine());
            sumRight += right;
        }
        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft - sumRight));
        }
    }
}
