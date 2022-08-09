package Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int videoCards = Integer.parseInt(sc.nextLine());
        int processors = Integer.parseInt(sc.nextLine());
        int ramMemory = Integer.parseInt(sc.nextLine());

        double videoCardsPrice = videoCards * 250;
        double processorsPrice =  processors * (videoCardsPrice * 0.35);
        double ramMemoryPrice = ramMemory * (videoCardsPrice * 0.10);

        double total = videoCardsPrice + processorsPrice + ramMemoryPrice;


        if (videoCards > processors)
            total -= total * 0.15;
        double difference = budget - total;
        if (budget >= total)
            System.out.printf("You have %.2f leva left!", difference);
        else
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(difference));
    }
}
