package Exercises;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        double salary;

        String input = sc.nextLine();

        while(!input.equals("ACTION")) {
            if (input.length() > 15) {
                budget -= budget * 0.20;
            } else {
                salary = Double.parseDouble(sc.nextLine());
                budget -= salary;
            }
            if (budget <= 0) {
                break;
            }
            input = sc.nextLine();
        }
        if (input.equals("ACTION")) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }
    }
}
