import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int computersCount = Integer.parseInt(sc.nextLine());
        double realSales;
        double salesCount = 0.0;
        double ratingSum = 0;


        for (int i = 1; i <= computersCount; i++) {
            int n = Integer.parseInt(sc.nextLine());
            int rating = n % 10;
            int sales = n / 10;
            if (rating == 3) {
                realSales = sales * 0.50;
                salesCount += realSales;
                ratingSum += rating;
            } else if (rating == 4) {
                realSales = sales * 0.70;
                salesCount += realSales;
                ratingSum += rating;
            } else if (rating == 5) {
                realSales = sales * 0.85;
                salesCount+= realSales;
                ratingSum += rating;
            } else if (rating == 6) {
                realSales = sales;
                salesCount += realSales;
                ratingSum += rating;
            } else if (rating == 2) {
                ratingSum += rating;
            }
        }
        double avg = ratingSum / computersCount;
        System.out.printf("%.2f%n", salesCount);
        System.out.printf("%.2f", avg);
    }
}
