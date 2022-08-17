package Exercises;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());

        int space = width * length * height;
        boolean isDone = false;
        int boxes;

        while (space >= 0) {
            String input = sc.nextLine();
            if (input.equals("Done")) {
                isDone = true;
                break;
            }
            boxes = Integer.parseInt(input);
            space -= boxes;
        }
        if (isDone) {
            System.out.printf("%d Cubic meters left.", space);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));

        }
    }
}
