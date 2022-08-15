package Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String actorName = sc.nextLine();
        double points = Double.parseDouble(sc.nextLine());
        int judges = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < judges; i++) {
            String judgeName = sc.nextLine();
            double judgePoints = Double.parseDouble(sc.nextLine());
            points += ((judgeName.length() * judgePoints) / 2);
            if (points > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
                break;
            }
        }
        if (points <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - points);
        }
    }
}
