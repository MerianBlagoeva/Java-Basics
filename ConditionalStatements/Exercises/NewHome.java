package Exercises;

import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String flower = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());
        double total = 0;

        switch (flower) {
            case "Roses":
                total = count * 5;
                if (count > 80)
                    total -= total * 0.10;
                break;
            case "Dahlias":
                total = count * 3.80;
                if (count > 90)
                    total -= total * 0.15;
                break;
            case "Tulips":
                total = count * 2.80;
                if (count > 80)
                    total -= total * 0.15;
                break;
            case "Narcissus":
                total = count * 3;
                if (count < 120)
                    total += (total * 0.15);
                break;
            case "Gladiolus":
                total = count * 2.50;
                if (count < 80)
                    total += total * 0.20;
                break;
        }

        double levaLeft = Math.abs(budget - total);
        if (budget >= total)
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, levaLeft);
        else
            System.out.printf("Not enough money, you need %.2f leva more.", levaLeft);

    }
}
