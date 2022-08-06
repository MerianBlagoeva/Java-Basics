package firststepsincoding.exercises;

import java.util.Scanner;

public class Supplies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = Integer.parseInt(sc.nextLine());
        int markers = Integer.parseInt(sc.nextLine());
        int cleaner = Integer.parseInt(sc.nextLine());
        int discount = Integer.parseInt(sc.nextLine());

        double pensSum = pens * 5.80;
        double markersPrice = markers * 7.20;
        double cleanerPrice = cleaner * 1.20;

        double total = pensSum + markersPrice + cleanerPrice;
        double totalAfterDiscount = total - (total * discount / 100);
        System.out.println(totalAfterDiscount);
    }
}
