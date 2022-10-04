import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fatPercent = Integer.parseInt(sc.nextLine());
        int proteinsPercent = Integer.parseInt(sc.nextLine());
        int carbsPercent = Integer.parseInt(sc.nextLine());
        int allCalories = Integer.parseInt(sc.nextLine());
        int waterPercent = Integer.parseInt(sc.nextLine());

        double allFat = 1.00 * allCalories * (1.00 * fatPercent / 100) / 9;
        double allProteins = 1.00 * allCalories * (1.00 * proteinsPercent / 100) / 4;
        double allCarbs = 1.00 * allCalories * (1.00 * carbsPercent / 100) / 4;

        double weight = allFat + allProteins + allCarbs;
        double caloriesPerGram = allCalories / weight;

        double water = caloriesPerGram * (1.00 *waterPercent / 100);
        double finalCal = caloriesPerGram - water;
        System.out.printf("%.4f", finalCal);
    }
}
