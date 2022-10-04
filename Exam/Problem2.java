import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double shirtPrice = Double.parseDouble(sc.nextLine());
        double neededSum = Double.parseDouble(sc.nextLine());

        double shortsPrice = shirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double buttonsPrice = (shortsPrice + shirtPrice) * 2;

        double total = shirtPrice + socksPrice + buttonsPrice + shortsPrice;
        total *= 0.85;

        if (total >= neededSum) {
            System.out.printf("Yes, he will earn the world-cup replica ball!%n" +
                    "His sum is %.2f lv.", total);
        } else {
            System.out.printf("No, he will not earn the world-cup replica ball.%n" +
                    "He needs %.2f lv. more.", neededSum - total);
        }
    }
}
