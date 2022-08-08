package firststepsincoding.exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nylon = Integer.parseInt(sc.nextLine());
        int paint = Integer.parseInt(sc.nextLine());
        int thinner = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());

        double nylonPrice = (nylon + 2) * 1.5;
        double paintPrice = (paint + paint * 10 / 100.00) * 14.50;
        double thinnerPrice = thinner * 5;

        double total = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double salaryPerHour = total * 0.30;
        double salary = salaryPerHour * hours;
        total += salary;

        System.out.println(total);
    }
}
