package Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double holidayPrice = Double.parseDouble(sc.nextLine());
        int puzzles = Integer.parseInt(sc.nextLine());
        int dolls = Integer.parseInt(sc.nextLine());
        int bears = Integer.parseInt(sc.nextLine());
        int minions = Integer.parseInt(sc.nextLine());
        int trucks = Integer.parseInt(sc.nextLine());

        double total = puzzles * 2.60 + dolls * 3 + bears * 4.10 +
                       minions * 8.20 + trucks * 2;

        if (puzzles + dolls + bears + minions + trucks >= 50) {
            total -= total * 0.25;
        }
        double rent = total * 0.10;
        total -= rent;

        double difference = total - holidayPrice;
        if (total >= holidayPrice) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(difference));
        }
    }
}
