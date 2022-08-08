package Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int examHour = Integer.parseInt(sc.nextLine());
        int examMinute = Integer.parseInt(sc.nextLine());
        int arriveHour = Integer.parseInt(sc.nextLine());
        int arriveMinute = Integer.parseInt(sc.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arriveTime = arriveHour * 60 + arriveMinute;

        int difference = Math.abs(examTime - arriveTime);

        int diffHours = difference / 60;
        int diffMinutes = difference % 60;

        if (examTime < arriveTime) {
            System.out.println("Late");
            if (diffHours == 0) {
                System.out.printf("%d minutes after the start", diffMinutes);
            } else {
                System.out.printf("%d:%02d hours after the start", diffHours, diffMinutes);
            }

        } else if (examTime == arriveTime || difference <= 30) {
            System.out.println("On time");
            if (difference != 0) {
                System.out.printf("%d minutes before the start", diffMinutes);
            }

        } else {
            System.out.println("Early");
            if (diffHours == 0) {
                System.out.printf("%d minutes before the start", difference);
            } else {
                System.out.printf("%d:%02d hours before the start", diffHours, diffMinutes);
            }
        }
    }
}
