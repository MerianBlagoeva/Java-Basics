package Exercises;

import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tournaments = Integer.parseInt(sc.nextLine());
        int startingPoints = Integer.parseInt(sc.nextLine());
        int points  = startingPoints;
        int wins = 0;

        for (int i = 0; i < tournaments; i++) {
            String stage = sc.nextLine();
            if ("W".equals(stage)) {
                points += 2000;
                wins++;
            } else if ("F".equals(stage)) {
                points += 1200;
            } else {
                points += 720;
            }
        }
        double percent =1.00 * wins / tournaments * 100;
        double avg = Math.floor((points * 1.00 - startingPoints) / tournaments);
        System.out.printf("Final points: %d%nAverage points: %.0f%n%.2f%%", points, avg, percent);
    }
}
