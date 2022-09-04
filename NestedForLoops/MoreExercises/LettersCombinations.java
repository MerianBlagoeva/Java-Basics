package MoreExercises;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char start = sc.nextLine().charAt(0);
        char end = sc.nextLine().charAt(0);
        char unwantedLetter = sc.nextLine().charAt(0);
        int count = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                for (int k = start; k <= end; k++) {
                    if (i != unwantedLetter && j != unwantedLetter && k != unwantedLetter) {
                        count++;
                        System.out.print(Character.toChars(i));
                        System.out.print(Character.toChars(j));
                        System.out.print(Character.toChars(k));
                        System.out.print(" ");
                    }
                }
            }
        }
        System.out.print(count);

    }
}
