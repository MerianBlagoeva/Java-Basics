package Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds1 = Integer.parseInt(sc.nextLine());
        int seconds2 = Integer.parseInt(sc.nextLine());
        int seconds3 = Integer.parseInt(sc.nextLine());
        int totalSeconds = seconds1 + seconds2 + seconds3;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
