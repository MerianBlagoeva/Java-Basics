package Lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floors = Integer.parseInt(sc.nextLine());
        int roomsPerFloor = Integer.parseInt(sc.nextLine());

        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j < roomsPerFloor; j++) {
                if (i == floors) { // проверка за последен етаж
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) { // проверка за четен етац
                    System.out.printf("O%d%d ", i, j);
                } else { // нечетен етаж
                    System.out.printf("A%d%d ", i, j);
                }

            }
            System.out.println();
        }
    }
}
