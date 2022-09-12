package MoreExercises;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int control = Integer.parseInt(sc.nextLine());
        int count = 0;
        int currentA = 0;
        int currentB = 0;
        int currentC = 0;
        int currentD = 0;
        boolean isFound = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a * b + c * d == control) {
                            if (a < b && c > d) {
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                count++;

                                if (count == 4) {
                                    isFound = true;
                                    currentA = a;
                                    currentB = b;
                                    currentC = c;
                                    currentD = d;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("");
        if (isFound) {
            System.out.printf("Password: %d%d%d%d", currentA,currentB,currentC,currentD);
        } else {
            System.out.println("No!");
        }
    }
}
