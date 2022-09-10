package MoreExercises;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int magicNumber = Integer.parseInt(sc.nextLine());
        boolean isFound = false;

        int count = 0;
        label:

        for (int i = start; i <= end; i++)
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNumber);
                    isFound = true;
                    break label;
                }
            }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d",count, magicNumber);
        }
    }
}
