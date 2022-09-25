import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String seriesName = sc.nextLine();
        int seasons = Integer.parseInt(sc.nextLine());
        int episodes = Integer.parseInt(sc.nextLine());
        double episodeTime = Double.parseDouble(sc.nextLine());

        episodeTime += (episodeTime * 0.20);

        double totalTime = Math.floor(seasons * episodes * episodeTime) + seasons * 10;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, totalTime);
    }
}
