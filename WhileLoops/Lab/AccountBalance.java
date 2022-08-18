package Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String amount = sc.nextLine();
        double total = 0;

        while (!amount.equals("NoMoreMoney")) {
            double currentAmount = Double.parseDouble(amount);
            if (currentAmount < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            total += currentAmount;
            System.out.printf("Increase: %.2f%n", Double.parseDouble(amount));
            amount = sc.nextLine();
        }
        System.out.printf("Total: %.2f", total);

    }
}
