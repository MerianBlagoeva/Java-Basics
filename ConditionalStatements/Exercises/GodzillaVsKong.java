package Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int statist = Integer.parseInt(sc.nextLine());
        double clothesPrice = Double.parseDouble(sc.nextLine());

        double decor = budget * 0.10;
        double totalClothes = statist * clothesPrice;
        if (statist > 150)
            totalClothes -= totalClothes * 0.10;

        double difference = (totalClothes + decor) - budget;

        if (totalClothes + decor > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", Math.abs(difference));

        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", Math.abs(difference));

        }
    }
}
