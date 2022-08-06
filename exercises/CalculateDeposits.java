package firststepsincoding.exercises;

import java.util.Scanner;

public class CalculateDeposits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double deposit = Double.parseDouble(sc.nextLine());
        int term = Integer.parseInt(sc.nextLine());
        double annualInterestRate = Double.parseDouble(sc.nextLine());

        double sum = deposit + term * ((deposit * annualInterestRate / 100) / 12);
        System.out.println(sum);


    }
}
