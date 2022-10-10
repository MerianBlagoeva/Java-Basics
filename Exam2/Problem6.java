import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int locationsCount = Integer.parseInt(sc.nextLine());


        for (int i = 1; i <= locationsCount; i++) {
            double sum = 0;
            double expectedGold = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            for (int j = 1; j <= days; j++) {
                double goldForTheDay = Double.parseDouble(sc.nextLine());
                sum += goldForTheDay;
            }
            double avg = sum / days;
            if (avg >= expectedGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", avg);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedGold - (avg));
            }
        }
    }
}
