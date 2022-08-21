package Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int juryCount = Integer.parseInt(sc.nextLine());
        double avgGrade;
        double allSum = 0;
        int gradesCount = 0;


        String presentationName = sc.nextLine();

        while (!presentationName.equals("Finish")) {
            double gradesSum = 0;
            for (int i = 1; i <= juryCount; i++) {
                double currentGrade = Double.parseDouble(sc.nextLine());
                gradesCount++;
                gradesSum += currentGrade;
                allSum += currentGrade;
            }
            avgGrade = gradesSum / juryCount;
            System.out.printf("%s - %.2f.%n", presentationName, avgGrade);

            presentationName = sc.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allSum / gradesCount);
    }
}
