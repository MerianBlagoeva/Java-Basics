package lab;

import java.util.Scanner;

public class RectangleArea2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int area = a * b;
        System.out.println(area);
    }
}
