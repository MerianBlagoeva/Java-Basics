import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int processorsNeeded = Integer.parseInt(sc.nextLine());
        int employees = Integer.parseInt(sc.nextLine());
        int workingDays = Integer.parseInt(sc.nextLine());

        double processorsMade = Math.floor((1.00 * workingDays * 8 * employees) / 3);

        if (processorsMade >= processorsNeeded) {
            System.out.printf("Profit: -> %.2f BGN", (processorsMade - processorsNeeded) * 110.10);
        } else {
            System.out.printf("Losses: -> %.2f BGN", (processorsNeeded - processorsMade) * 110.10);
        }

    }
}
