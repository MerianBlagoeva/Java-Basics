package Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double moneyForHoliday = Double.parseDouble(sc.nextLine());
        double herMoney = Double.parseDouble(sc.nextLine());
        int spendCount = 0;
        int daysCount = 0;
        boolean cantSave = false;

        while (herMoney < moneyForHoliday) {
            String action = sc.nextLine();
            double amount = Double.parseDouble(sc.nextLine());
            daysCount++;
            if (action.equals("spend")) {
                spendCount++;
                herMoney -= amount;
            } else {
                spendCount = 0;
                herMoney += amount;
            }
                if (spendCount == 5) {
                    cantSave = true;
                    break;
                }
                if (herMoney < 0) {
                    herMoney = 0;
                }
        }
        if (cantSave) {
            System.out.println("You can't save the money.");
            System.out.println(daysCount);
        } else {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}