package Exercises;

        import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String movie = sc.nextLine();
        int movieDuration = Integer.parseInt(sc.nextLine());
        int breakTime = Integer.parseInt(sc.nextLine());

        double lunchTime = breakTime / 8.0;
        double restTime = breakTime / 4.0;

        double totalTime = movieDuration + lunchTime + restTime;
        double leftTime = Math.abs(breakTime- totalTime);

        if (breakTime >= totalTime)
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movie, Math.ceil(leftTime));
        else
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movie, Math.ceil(leftTime));
    }
}
