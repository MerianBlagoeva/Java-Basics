package Lab;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int totalMinutes = hours * 60 + minutes + 30;
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;

        if (hours == 24) {
            hours = 0;
        }
        System.out.printf("%d:%02d",hours, minutes);
    }
}
