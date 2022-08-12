package Lab;

import java.util.Scanner;

public class Sequence2kplus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int number = 1;

        while (number <= n) {
            System.out.println(number);
            number = number * 2 + 1;
        }
    }
}
