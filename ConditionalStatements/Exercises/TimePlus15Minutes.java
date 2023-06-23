package src.Exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        minutes = hours * 60 + minutes + 15;

        hours = minutes / 60;
        minutes %= 60;
        if (hours == 24)
            hours = 0;
        System.out.printf("%d:%02d", hours, minutes);
    }
}
