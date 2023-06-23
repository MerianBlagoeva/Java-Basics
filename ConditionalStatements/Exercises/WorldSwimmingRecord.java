package src.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double currentRecord = Double.parseDouble(sc.nextLine());
        double meters = Double.parseDouble(sc.nextLine());
        double timeInSecondsForMeter = Double.parseDouble(sc.nextLine());

        double ivanTime = meters * timeInSecondsForMeter;
        double totalWaterResistance = Math.floor(meters / 15) * 12.5;


        ivanTime += totalWaterResistance;
        double difference = currentRecord - ivanTime;

        if (ivanTime >= currentRecord) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(difference));
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        }
    }
}
