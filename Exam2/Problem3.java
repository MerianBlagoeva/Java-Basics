import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        String sex = sc.nextLine();

        int catMonths = 0;

        switch (type) {
            case "British Shorthair":
                if (sex.equals("m")) {
                    catMonths = (13 * 12) / 6;
                } else {
                    catMonths = (14 * 12) / 6;
                }
                break;
            case "Siamese":
                if (sex.equals("m")) {
                    catMonths = (15 * 12) / 6;
                } else {
                    catMonths = (16 * 12) / 6;
                }
                break;
            case "Persian":
                if (sex.equals("m")) {
                    catMonths = (14 * 12) / 6;
                } else {
                    catMonths = (15 * 12) / 6;
                }
                break;
            case "Ragdoll":
                if (sex.equals("m")) {
                    catMonths = (16 * 12) / 6;
                } else {
                    catMonths = (17 * 12) / 6;
                }
                break;
            case "American Shorthair":
                if (sex.equals("m")) {
                    catMonths = (12 * 12) / 6;
                } else {
                    catMonths = (13 * 12) / 6;
                }
                break;
            case "Siberian":
                if (sex.equals("m")) {
                    catMonths = (11 * 12) / 6;
                } else {
                    catMonths = (12 * 12) / 6;
                }
                break;
            default:
                System.out.printf("%s is invalid cat!", type);
                return;
        }
        System.out.printf("%d cat months", catMonths);
    }
}
