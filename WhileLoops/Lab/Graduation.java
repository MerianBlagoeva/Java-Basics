package Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int badGradeCount = 0;
        int goodGradeCount = 0;
        double gradesSum = 0;
        int gradeCount = 1;


        while (goodGradeCount < 12) {
            if (badGradeCount == 2) {
                break;
            }
            double currentGrade = Double.parseDouble(sc.nextLine());
            gradesSum += currentGrade;
            if (currentGrade < 4.00) {
                badGradeCount++;
                continue;
            }
            goodGradeCount++;
            gradeCount++;

        }
        double avg = gradesSum / (1.00 * goodGradeCount);
        if (goodGradeCount == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, avg);
        } else {
            System.out.printf("%s has been excluded at %d grade ", name, gradeCount);
        }
    }
}
