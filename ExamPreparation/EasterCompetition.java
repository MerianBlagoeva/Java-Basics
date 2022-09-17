import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int breadsCount = Integer.parseInt(sc.nextLine());
        int maxPoints = Integer.MIN_VALUE;

        String winner = "";

        for (int i = 1; i <= breadsCount; i++) {
            String name = sc.nextLine();

            int totalPoints = 0;


            String input = sc.nextLine();
            while (!input.equals("Stop")) {
                int currentPoints = Integer.parseInt(input);
                totalPoints += currentPoints;
                input = sc.nextLine();
            }
            System.out.printf("%s has %d points.%n", name, totalPoints);

            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                System.out.printf("%s is the new number 1!%n", name);
                winner = name;
            }
        }
        System.out.printf("%s won competition with %d points!", winner, maxPoints);
    }
}