import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double profit = 0;

        int seaVacations = Integer.parseInt(sc.nextLine());
        int mountainVacations = Integer.parseInt(sc.nextLine());

        String type = sc.nextLine();
        while (!type.equals("Stop")) {

            if (type.equals("sea")) {
                if (seaVacations != 0) {
                    profit += 680;
                    seaVacations--;
                }
            } else {
                if (mountainVacations != 0) {
                    profit += 499;
                    mountainVacations--;
                }
            }
            if (seaVacations == 0 && mountainVacations == 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }


            type = sc.nextLine();
        }
        System.out.printf("Profit: %.0f leva.", profit);
    }
}
