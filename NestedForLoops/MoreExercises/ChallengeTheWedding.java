package MoreExercises;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menCount = Integer.parseInt(sc.nextLine());
        int womenCount = Integer.parseInt(sc.nextLine());
        int maxTables = Integer.parseInt(sc.nextLine());
        int count = 0;

        for (int i = 1; i <= menCount; i++) {
            for (int j = 1; j <= womenCount; j++) {
                count++;
                if (count <= maxTables) {
                    System.out.printf("(%d <-> %d) ", i, j);
                }
            }
        }
    }
}