package Lab;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();

        switch (product) {
            case "banana", "apple", "kiwi", "cherry", "lemon", "grapes" -> System.out.println("fruit");
            case "tomato", "cucumber", "pepper", "carrot" -> System.out.println("vegetable");
            default -> System.out.println("unknown");
        }
    }
}
