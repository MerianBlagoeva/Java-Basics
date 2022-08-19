package Lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movieName = sc.nextLine();
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;

        int totalTickets = 0;
        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(sc.nextLine());
            int soldTickets = 0;

            String ticketType = sc.nextLine();

            while (!ticketType.equals("End")) {
                soldTickets++;
                totalTickets++;

                if (ticketType.equals("student")) {
                    studentCount++;
                } else if (ticketType.equals("standard")) {
                    standardCount++;
                } else if (ticketType.equals("kid")){
                    kidCount++;
                }
                if (soldTickets == freeSeats) {
                    break;
                }
                ticketType = sc.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, 1.0 * soldTickets / freeSeats * 100);
            movieName = sc.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n",  1.00 * studentCount / totalTickets * 100 );
        System.out.printf("%.2f%% standard tickets.%n", 1.00 * standardCount / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", 1.00 * kidCount / totalTickets * 100);
    }
}