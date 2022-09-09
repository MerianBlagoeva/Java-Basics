package MoreExercises;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int maxPasswords = Integer.parseInt(sc.nextLine());
        int first = 35;
        int second = 64;
        int count = 0;
        label:

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {

                if (first > 55) {
                    first = 35;
                }
                if (second > 96) {
                    second = 64;
                }
                if (count >= maxPasswords) {
                    break label;
                }
                count++;

                System.out.printf("%c%c%d%d%c%c|", first, second, i, j, second, first);

                first++;
                second++;

            }
        }
    }
}