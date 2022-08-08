package firststepsincoding.exercises;

import java.util.Scanner;

public class MandatoryLiterature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pageCount = Integer.parseInt(sc.nextLine());
        int pagesPerHour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        int hours = (pageCount / pagesPerHour) / days;
        System.out.println(hours);
    }
}
