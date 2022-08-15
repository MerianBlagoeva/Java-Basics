package Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());
        double price = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());
        double money = 0;
        int evenCount = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                evenCount++;
                money += 10 * evenCount;
                money -= 1;
            } else {
                money += toyPrice;
            }
        }
        if (money >= price) {
            System.out.printf("Yes! %.2f", money - price);
        } else {
            System.out.printf("No! %.2f", Math.abs(price - money));
        }
    }
}