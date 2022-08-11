import java.util.Scanner;

public class Bike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juniors = Integer.parseInt(sc.nextLine());
        int seniors = Integer.parseInt(sc.nextLine());
        String trace = sc.nextLine();

        double sum = 0;

        switch (trace) {
            case "trail":
                sum = juniors * 5.5 + seniors * 7;
                break;
            case "cross-country":
                sum = juniors * 8 + seniors * 9.5;
                if (juniors + seniors >= 50) {
                    sum -= sum * 0.25;
                }
                break;
            case "downhill":
                sum = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                sum = juniors * 20 + seniors * 21.50;
                break;
            default:

        }
        sum -= sum * 0.05;
        System.out.printf("%.2f", sum);
    }
}