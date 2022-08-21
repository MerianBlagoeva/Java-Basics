package Exercises;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while(!input.equals("stop")) {


            int currentNum = Integer.parseInt(input);
            if (currentNum < 0) {
                System.out.println("Number is negative.");
                input = sc.nextLine();
                continue;
            }
            boolean flag = true;
            for (int i = 2; i <= currentNum - 1; i++) {
                if (currentNum % i == 0) {
                    nonPrimeSum += currentNum;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primeSum += currentNum;
            }
            input = sc.nextLine();
        }
            System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
            System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);
    }
}
