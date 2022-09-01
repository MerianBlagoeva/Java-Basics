package MoreExercises;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                for (int k = start; k <= end ; k++) {
                    for (int l = start; l <= end ; l++) {
                        if (((i % 2 == 0 && l % 2 != 0) || (i % 2 != 0 && l % 2 == 0))
                            && i > l && (j + k) % 2 == 0) {
                            System.out.printf("%d%d%d%d ", i,j,k,l);
                        }
                    }
                }
            }
        }
    }
}