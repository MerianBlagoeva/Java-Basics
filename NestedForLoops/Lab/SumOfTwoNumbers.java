package Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int number = Integer.parseInt(sc.nextLine());
        int counter = 0;
        boolean noCombination = false;

        label:

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == number) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, number);
                    noCombination = true;
                    break label;
                }
            }
        }
        if (!noCombination) {
            System.out.printf("%d combinations - neither equals %d", counter, number);
        }
    }
}
