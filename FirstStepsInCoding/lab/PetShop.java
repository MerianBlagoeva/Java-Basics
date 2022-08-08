package lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dogFoodCount = Integer.parseInt(sc.nextLine());
        int catFoodCount = Integer.parseInt(sc.nextLine());

        double dogPrice = dogFoodCount * 2.5;
        double catMoney = catFoodCount * 4;

        double expenses = dogPrice + catMoney;
        System.out.printf("%f lv", expenses);
    }
}
