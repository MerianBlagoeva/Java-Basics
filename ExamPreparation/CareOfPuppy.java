import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int foodBuyKg = Integer.parseInt(sc.nextLine());
        int foodInGrams = foodBuyKg * 1000;
        int allEatenFood = 0;

        String command = sc.nextLine();

        while(!command.equals("Adopted")) {
            int currentFood = Integer.parseInt(command);
            allEatenFood += currentFood;


            command = sc.nextLine();
        }
        if (allEatenFood <= foodInGrams) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams - allEatenFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(allEatenFood - foodInGrams));
        }
    }
}
