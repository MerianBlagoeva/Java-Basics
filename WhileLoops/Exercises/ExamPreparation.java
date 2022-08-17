package Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int poorGrades = Integer.parseInt(sc.nextLine());
        String task = sc.nextLine();
        int poorGradesCount = 0;
        int gradesCount = 0;
        double gradesSum = 0;
        double avg;
        String lastTask = "";

        while (!task.equals("Enough")) {
            int grade = Integer.parseInt(sc.nextLine());

            if (grade <= 4) {
                poorGradesCount++;
            }
            if (poorGradesCount == poorGrades) {
                break;
            }
            gradesSum += grade;
            gradesCount++;
            lastTask = task;
            task = sc.nextLine();
        }
        avg = gradesSum / (gradesCount * 1.00);
        if (task.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", avg);
            System.out.printf("Number of problems: %d%n", gradesCount);
            System.out.printf("Last problem: %s", lastTask);
        } else {
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        }
    }
}
