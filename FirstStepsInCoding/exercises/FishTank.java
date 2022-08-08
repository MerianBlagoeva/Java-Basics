package firststepsincoding.exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());

        double volumeCm = length * width * height;
        double volumeDm = volumeCm / 1000;
        double neededWater = volumeDm * (1 - percent / 100);
        System.out.println(neededWater);
    }
}
