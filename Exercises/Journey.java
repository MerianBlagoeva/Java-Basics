package Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        double moneySpent = 0;
        String destination = "Europe";
        String stay = "Camp";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                moneySpent = budget * 0.30;
            } else {
                stay = "Hotel";
                moneySpent = budget * 0.70;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                moneySpent = budget * 0.40;
            } else {
                stay = "Hotel";
                moneySpent = budget * 0.80;
            }
        } else {
            moneySpent = budget * 0.90;
            stay = "Hotel";
        }
        System.out.printf("Somewhere in %s%n%s - %.2f", destination, stay, moneySpent);
    }
}
