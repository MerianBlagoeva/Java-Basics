package firststepsincoding.exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(sc.nextLine());
        int fishMenu = Integer.parseInt(sc.nextLine());
        int vegetarianMenu = Integer.parseInt(sc.nextLine());

        double total = chickenMenu * 10.35 + fishMenu * 12.40
                    + vegetarianMenu * 8.15;

        double dessertPrice = total * 0.20;

        total += dessertPrice + 2.50;
        System.out.println(total);

    }
}
