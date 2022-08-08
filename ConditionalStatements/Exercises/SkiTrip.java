package Exercises;

import java.util.Scanner;


public class SkiTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        String room = sc.nextLine();
        String rating = sc.nextLine();
        double price;
        double total = 0;

        switch (room) {
            case "room for one person":
                price = 18;
                total = price * (days - 1);
                break;
            case "apartment":
                price = 25;
                total = price * (days - 1);
                if (days < 10) {
                    total *= 0.7;
                } else if (days > 10 && days < 15) {
                    total *= 0.65;
                } else if (days > 15) {
                    total *= 0.5;
                }
                break;
            case "president apartment":
                price = 35;
                total = price * (days - 1);
                if (days < 10) {
                    total *= 0.9;
                } else if (days > 10 && days < 15) {
                    total *= 0.65;
                } else if (days > 15) {
                    total *= 0.8;
                }
                break;
        }
        if (rating.equals("positive")) {
            total += total * 0.25;
        } else {
            total -= total * 0.10;
        }
        System.out.printf("%.2f", total);
    }
}