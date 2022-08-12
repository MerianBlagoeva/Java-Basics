package Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNumber = Integer.parseInt(sc.nextLine());
        int sum = 0;

        while (sum < maxNumber) {
            int currentNum = Integer.parseInt(sc.nextLine());
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
