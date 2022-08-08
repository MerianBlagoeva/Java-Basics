package lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area = Double.parseDouble(sc.nextLine());

        double price = area * 7.61;
        double discount = price * 0.18;
        double total = price - discount;
        System.out.printf("The final price is: %f lv \n", total);
        System.out.printf("The discount is: %f lv ", discount);
    }
}
