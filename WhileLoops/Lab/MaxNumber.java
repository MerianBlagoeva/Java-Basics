package Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number > maxNumber) {
                maxNumber = number;
            }

            input = sc.nextLine();
        }
        System.out.println(maxNumber);
    }
}
