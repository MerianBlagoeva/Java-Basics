package Exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fishermen = Integer.parseInt(sc.nextLine());
        double price;

        if (season.equals("Spring"))
            price = 3000;
        else if (season.equals("Summer") || (season.equals("Autumn")))
            price = 4200;
        else
            price = 2600;


        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            price -= price * 0.05;
        }

        if (fishermen <= 6)
            price -= price * 0.10;
        else if (fishermen <= 11)
            price -= price * 0.15;
        else
            price -= price * 0.25;
        double difference = Math.abs(budget - price);
        if (budget >= price)
            System.out.printf("Yes! You have %.2f leva left.", difference);
        else
            System.out.printf("Not enough money! You need %.2f leva.", difference);

    }
}
