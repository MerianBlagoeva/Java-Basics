package src.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        double area = 0;

        if (figure.equals("square")) {
            double a = Double.parseDouble(sc.nextLine());
            area = a * a;
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            area = a * b;
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(sc.nextLine());
            area = Math.PI * r * r;
        } else if (figure.equals("triangle")) {
            double b = Double.parseDouble(sc.nextLine());
            double h = Double.parseDouble(sc.nextLine());
            area = 0.5 * b * h;
        }
        System.out.printf("%.3f", area);
    }
}
