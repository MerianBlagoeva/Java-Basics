import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cardPrice = Integer.parseInt(sc.nextLine());
        int transistor = Integer.parseInt(sc.nextLine());
        double energyForDay = Double.parseDouble(sc.nextLine());
        double profitPerDay = Double.parseDouble(sc.nextLine());


        double total = (13 * cardPrice) + (13 * transistor) + 1000;
        double profitCard = profitPerDay - energyForDay;
        double allProfitCards = 13 * profitCard;
        double days = total / allProfitCards;

        System.out.printf("%.0f%n", total);
        System.out.printf("%.0f", Math.ceil(days));

    }
}
