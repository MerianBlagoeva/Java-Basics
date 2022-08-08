package firststepsincoding.exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax = Integer.parseInt(sc.nextLine());
        double sneakers = tax - (tax * 0.40);
        double equip = sneakers - (sneakers * 0.20);
        double ball = equip / 4;
        double accessories = ball / 5;

        double total = tax + sneakers + equip + ball + accessories;
        System.out.println(total);
    }
}
