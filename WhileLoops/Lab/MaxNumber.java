package Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();
        int max = Integer.MIN_VALUE;

        while (!number.equals("Stop")) {
            int n = Integer.parseInt(number);
            if (n > max) {
                max = n;
            }
            number = sc.nextLine();
        }
        System.out.println(max);
    }
}
