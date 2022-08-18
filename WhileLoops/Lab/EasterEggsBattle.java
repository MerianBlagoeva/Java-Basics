package Lab;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eggsOne = Integer.parseInt(sc.nextLine());
        int eggsTwo = Integer.parseInt(sc.nextLine());

        String winner = sc.nextLine();
        while (!winner.equals("End")) {
            if (winner.equals("one")) {
                eggsTwo--;
            } else if (winner.equals("two")) {
                eggsOne--;
            }
            if (eggsOne == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsTwo);
                return;
            } else if (eggsTwo == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsOne);
                return;
            }
            winner = sc.nextLine();
        }
        System.out.printf("Player one has %d eggs left.%n", eggsOne);
        System.out.printf("Player two has %d eggs left.", eggsTwo);
    }
}
