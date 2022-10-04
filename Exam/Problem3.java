import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        String room = sc.nextLine();
        String review = sc.nextLine();
        double total = 0;

        double price;

        switch (room) {
            case "room for one person":
                price = 18;
                total = (days - 1) * price;
                break;
            case "apartment":
                price = 25;
                total = (days - 1) * price;
                if (days < 10) {
                    total *= 0.70;
                } else if (days <= 15) {
                    total *= 0.65;
                } else {
                    total *= 0.50;
                }
                break;
            case "president apartment":
                price = 35;
                total = (days - 1) * price;
                if (days < 10) {
                    total *= 0.90;
                } else if (days <= 15) {
                    total *= 0.85;
                } else {
                    total *= 0.80;
                }
                break;
        }
        if (review.equals("positive")) {
            total += (total * 0.25);
        } else {
            total -= (total * 0.10);
        }
        System.out.printf("%.2f", total);
    }
}
