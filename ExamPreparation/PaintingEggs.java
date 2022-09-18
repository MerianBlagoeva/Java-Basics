import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String size = sc.nextLine();
        String color = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        int price;
        double totalPrice = 0;

        switch (size) {
            case "Large":
                if (color.equals("Red")) {
                    price = 16;
                    totalPrice += price * count;
                } else if (color.equals("Green")) {
                    price = 12;
                    totalPrice += price * count;
                } else if (color.equals("Yellow")) {
                    price = 9;
                    totalPrice += price * count;
                }
                break;
            case "Medium":
                if (color.equals("Red")) {
                    price = 13;
                    totalPrice += price * count;
                } else if (color.equals("Green")) {
                    price = 9;
                    totalPrice += price * count;
                } else if (color.equals("Yellow")) {
                    price = 7;
                    totalPrice += price * count;
                }
                break;
            case "Small":
                if (color.equals("Red")) {
                    price = 9;
                    totalPrice += price * count;
                } else if (color.equals("Green")) {
                    price = 8;
                    totalPrice += price * count;
                } else if (color.equals("Yellow")) {
                    price = 5;
                    totalPrice += price * count;
                }
                break;
        }
        double expenses = totalPrice * 0.35;

        double total = totalPrice - expenses;
        System.out.printf("%.2f leva.", total);
    }
}
