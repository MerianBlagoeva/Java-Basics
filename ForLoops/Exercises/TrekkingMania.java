package Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int groups = Integer.parseInt(sc.nextLine());
        int g1 = 0;
        int g2 = 0;
        int g3 = 0;
        int g4 = 0;
        int g5 = 0;
        int peopleCount = 0;
        for (int i = 1; i <= groups; i++) {
            int peopleInGroup = Integer.parseInt(sc.nextLine());
            peopleCount += peopleInGroup;
            if (peopleInGroup <= 5) {
                g1 += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                g2 += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                g3 += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                g4 += peopleInGroup;
            } else {
                g5 += peopleInGroup;
            }
        }
        System.out.printf("%.2f%%%n", 1.00 * g1 / peopleCount * 100.00);
        System.out.printf("%.2f%%%n", 1.00 * g2 / peopleCount * 100.00);
        System.out.printf("%.2f%%%n", 1.00 * g3 / peopleCount * 100.00);
        System.out.printf("%.2f%%%n", 1.00 * g4 / peopleCount * 100.00);
        System.out.printf("%.2f%%%n", 1.00 * g5 / peopleCount * 100.00);
    }
}
