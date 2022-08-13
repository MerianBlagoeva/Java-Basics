package Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String searchedBook = sc.nextLine();
        String book = sc.nextLine();
        int booksCount = 0;

        while (!book.equals(searchedBook)) {
            if (book.equals("No More Books")) {
                System.out.printf("The book you search is not here! %nYou checked %d books.", booksCount);
                return;
            }
            book = sc.nextLine();
            booksCount++;
        }
        System.out.printf("You checked %d books and found it.", booksCount);
    }
}