package Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String destination = sc.nextLine();

        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(sc.nextLine());
            double savedMoney = 0;

            while (savedMoney < minBudget) {
                savedMoney += Double.parseDouble(sc.nextLine());
            }
            System.out.printf("Going to %s!%n", destination);

            destination = sc.nextLine();

        }
    }
}
