package Exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int stepsWalked = 0;

        while (stepsWalked < 10000) {
            String input = sc.nextLine();
            if (input.equals("Going home")) {
                stepsWalked += Integer.parseInt(sc.nextLine());
                break;
            }
            stepsWalked += Integer.parseInt(input);
        }
        boolean hasSucceeded = stepsWalked >= 10000;
        if (hasSucceeded) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", stepsWalked - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - stepsWalked);
        }
    }
}
