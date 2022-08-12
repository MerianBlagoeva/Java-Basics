package Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();

        String input = sc.nextLine();
        while (!input.equals(password)) {
            input = sc.nextLine();
        }
        System.out.printf("Welcome %s!", username);

    }
}
