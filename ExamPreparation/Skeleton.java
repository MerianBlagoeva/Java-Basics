import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutes = Integer.parseInt(sc.nextLine());
        int seconds = Integer.parseInt(sc.nextLine());
        double length = Double.parseDouble(sc.nextLine());
        int secondsFor100meters = Integer.parseInt(sc.nextLine());

        int totalSecondsControl = minutes * 60 + seconds;

        double slowingTimes = Math.floor(length / 120);
        double totalSlowing = slowingTimes * 2.5;

        double totalSec = (length / 100) * secondsFor100meters - totalSlowing;

        if (totalSec <= totalSecondsControl) {
            System.out.printf("Marin Bangiev won an Olympic quota!%n" +
                    "His time is %.3f.", totalSec);
        } else {
            System.out.printf("No, Marin failed!%nHe was %.3f second slower.", totalSecondsControl - totalSec );
        }


    }
}
