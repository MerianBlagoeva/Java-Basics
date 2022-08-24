package MoreExercises;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                for (int k = a; k < b; k++) {
                    for (int l = a; l <= b; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
