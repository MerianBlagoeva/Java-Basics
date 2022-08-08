package Lab;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        if (number >= -100 && number <= 100 && number != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
