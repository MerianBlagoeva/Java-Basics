package Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        while (sum < n) {
            int number = Integer.parseInt(sc.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
