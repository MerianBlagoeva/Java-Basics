package Exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());

        int allPieces = width * length;

        boolean isStopped = false;
        while (allPieces >= 0) {
            String input = sc.nextLine();
            if (input.equals("STOP")) {
                isStopped = true;
                break;
            }
            int piecesTaken = Integer.parseInt(input);

            allPieces -= piecesTaken;

            if (allPieces < 0) {
                break;
            }
        }
        if (isStopped) {
            System.out.printf("%d pieces are left.", allPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allPieces));
        }
    }
}