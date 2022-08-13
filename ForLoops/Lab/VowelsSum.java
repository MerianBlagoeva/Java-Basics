package Lab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                sum += 1;
            }
            if (s.charAt(i) == 'e') {
                sum += 2;
            }
            if (s.charAt(i) == 'i') {
                sum += 3;
            }
            if (s.charAt(i) == 'o') {
                sum += 4;
            }
            if (s.charAt(i) == 'u') {
                sum += 5;
            }
        }
        System.out.println(sum);
    }
}
