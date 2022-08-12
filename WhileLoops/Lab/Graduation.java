package Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int goodGrades = 0;
        int poorGrades = 0;
        int gradeCount = 1;
        double allGrades = 0;


        while (goodGrades < 12) {
            if (poorGrades == 2) {
                break;
            }
            double grade = sc.nextInt();

            if (grade < 4) {
                poorGrades ++;
                continue;
            }

            goodGrades++;
            gradeCount++;
            allGrades += grade;
        }
        double avgGrade = allGrades / gradeCount;
        if (goodGrades >= 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, gradeCount);
        }
    }
}
