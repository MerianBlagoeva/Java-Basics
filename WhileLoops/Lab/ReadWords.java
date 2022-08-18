package Lab;

import java.util.Scanner;

public class ReadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        while (!text.equals("Stop")) {
            System.out.println(text);
            text = sc.nextLine();
        }
    }
}
