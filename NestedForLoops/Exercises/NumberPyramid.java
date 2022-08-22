package Exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        int currentNumber = 0;
        for(int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                currentNumber++;
                if (currentNumber > n) {
                    flag = true;
                    break;
                }
                System.out.print(currentNumber + " ");
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}
