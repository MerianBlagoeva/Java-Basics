import java.util.Scanner;

public class Skeleton2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int controlInMinutes = Integer.parseInt(sc.nextLine());
        int controlInSeconds = Integer.parseInt(sc.nextLine());
        double chuteInMeters = Double.parseDouble(sc.nextLine());
        int secondsFor100Meters = Integer.parseInt(sc.nextLine());

        int allControlSeconds = controlInMinutes * 60 + controlInSeconds;

        double slowingTimes = chuteInMeters / 120;
        double times = slowingTimes * 2.5;

        double hisSeconds = (chuteInMeters / 100) * secondsFor100Meters - times;

        if (hisSeconds <= allControlSeconds) {
            System.out.printf("Marin Bangiev won an Olympic quota!%n" +
                    "His time is %.3f.", hisSeconds);
        } else {
            System.out.printf("No, Marin failed! He was %.3f seconds slower.", hisSeconds - allControlSeconds);
        }
    }
}
