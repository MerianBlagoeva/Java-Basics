package src.Exercises;

import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        double bonusPoints = 0;
        double totalPoints = 0;


        if (number <= 100) {
            bonusPoints = 5;
        } else if (number > 1000) {
            bonusPoints = number * 0.1;
        } else {
            bonusPoints = number * 0.2;
        }
        if (number % 2 == 0) {
            bonusPoints += 1;
        } else if (number % 10 == 5) {
            bonusPoints += 2;
        }
        totalPoints = number + bonusPoints;
        System.out.printf("%f%n%f", bonusPoints, totalPoints);
    }
}
