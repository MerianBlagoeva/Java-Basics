package src.Lab;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
