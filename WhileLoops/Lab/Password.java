package Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        String correctPass = sc.nextLine();
        String pass = sc.nextLine();

        while (!pass.equals(correctPass)) {
            pass = sc.nextLine();
        }
        System.out.println("Welcome " + username + "!");
    }
}
