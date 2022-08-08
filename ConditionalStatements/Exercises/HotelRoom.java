package Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();
        int days = Integer.parseInt(sc.nextLine());
        String stay = "";
        double priceStudio = 0.0;
        double priceApartment = 0.0;
        double totalStudio;
        double totalAp;

        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                    if (days > 7 && days <= 14) {
                        priceStudio -= priceStudio * 0.05;
                    } else if (days > 14) {
                        priceStudio -= priceStudio * 0.30;
                    }
                    break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                if (days > 14) {
                    priceStudio -= priceStudio * 0.20;
                }
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                break;
        }
        if (days > 14) {
            priceApartment -= priceApartment * 0.10;
        }
        totalStudio = priceStudio * days;
        totalAp = priceApartment * days;

        System.out.printf("Apartment: %.2f lv.%n", totalAp);
        System.out.printf("Studio: %.2f lv.", totalStudio);
    }
}
