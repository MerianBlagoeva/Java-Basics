package MoreExercises;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxHundreds = Integer.parseInt(sc.nextLine());
        int maxTens = Integer.parseInt(sc.nextLine());
        int maxUnits = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= maxHundreds; i++) {
            for (int j = 1; j <= maxTens; j++) {
                for (int k = 1; k <= maxUnits ; k++) {
                    if ((k % 2 == 0 && i % 2 == 0) && (j == 2 || j == 3 || j == 5 || j == 7)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
