import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int catsCount = Integer.parseInt(sc.nextLine());
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        double sum = 0;

        for (int i = 1; i <= catsCount; i++) {
            double food = Double.parseDouble(sc.nextLine());
            if (food >= 100 && food < 200) {
                group1++;
                sum += food;
            } else if (food >= 200 && food < 300) {
                group2++;
                sum += food;
            } else {
                group3++;
                sum += food;
            }
        }
        double price = (sum / 1000) * 12.45;
        System.out.printf("Group 1: %d cats.%n", group1);
        System.out.printf("Group 2: %d cats.%n", group2);
        System.out.printf("Group 3: %d cats.%n", group3);
        System.out.printf("Price for food per day: %.2f lv.", price);
    }
}
