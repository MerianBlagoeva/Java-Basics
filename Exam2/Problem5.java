import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int toysCount = 0;
        int sweaters = 0;

        while (!input.equals("Christmas")) {
            int age = Integer.parseInt(input);
            if (age <= 16) {
                toysCount++;
            } else {
                sweaters++;
            }

            input = sc.nextLine();
        }
        double toysPrice = toysCount * 5;
        double sweatersPrice = sweaters * 15;
        System.out.printf("Number of adults: %d%n", sweaters);
        System.out.printf("Number of kids: %d%n", toysCount);
        System.out.printf("Money for toys: %.0f%n", toysPrice);
        System.out.printf("Money for sweaters: %.0f", sweatersPrice);

    }
}
