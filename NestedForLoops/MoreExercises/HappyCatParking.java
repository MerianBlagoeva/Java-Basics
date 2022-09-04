package MoreExercises;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        int hoursPerDay = Integer.parseInt(sc.nextLine());
        double totalAll = 0;

        for (int i = 1; i <= days; i++) {
            double price = 0;
            double totalDay = 0;
            for (int j = 1; j <= hoursPerDay; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    price = 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    price = 1.25;
                } else {
                    price = 1;
                }
                totalDay += price;
            }
            totalAll += totalDay;
            System.out.printf("Day: %d - %.2f leva%n", i, totalDay);
        }
        System.out.printf("Total: %.2f leva", totalAll);
    }
}
