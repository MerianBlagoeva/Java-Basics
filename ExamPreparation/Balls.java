import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ballsCount = Integer.parseInt(sc.nextLine());
        int points = 0;
        int redCount = 0;
        int orangeCount = 0;
        int yellowCount = 0;
        int whiteCount = 0;
        int blackCount = 0;
        int otherCount = 0;

        for (int i = 1; i <= ballsCount; i++) {
            String color = sc.nextLine();

            switch (color) {
                case "red":
                    redCount++;
                    points += 5;
                    break;
                case "orange":
                    orangeCount++;
                    points += 10;
                    break;
                case "yellow":
                    yellowCount++;
                    points += 15;
                    break;
                case "white":
                    whiteCount++;
                    points += 20;
                    break;
                case "black":
                    blackCount++;
                    points = points / 2;
                    break;
                default:
                    otherCount++;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Red balls: %d%n", redCount);
        System.out.printf("Orange balls: %d%n", orangeCount);
        System.out.printf("Yellow balls: %d%n", yellowCount);
        System.out.printf("White balls: %d%n", whiteCount);
        System.out.printf("Other colors picked: %d%n", otherCount);
        System.out.printf("Divides from black balls: %d%n", blackCount);
    }
}
