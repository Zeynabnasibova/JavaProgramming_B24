package SamePdfTask.ProblemSet1;
import java.util.Scanner;
public class GradeLevelNestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        [Grade level]
        Given a grade level (byte)
        determine and print which school level someone is in.
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School
        Other: Invalid grade level given
         */

        System.out.println("Input Grade Level");
        byte gradeLevel = input.nextByte();

        boolean gradeLevels = gradeLevel >= 1 && gradeLevel <= 5 || gradeLevel >= 6 && gradeLevel <= 8 || gradeLevel >= 9 && gradeLevel <= 12 || gradeLevel >= 13 && gradeLevel <= 16 || gradeLevel >= 17 && gradeLevel <= 18;

        if (gradeLevels) {

            if (gradeLevel >= 1 && gradeLevel <= 5) {
                System.out.println("Elementary school");
            }
            if (gradeLevel >= 6 && gradeLevel <= 8) {
                System.out.println("Middle school");
            }
            if (gradeLevel >= 9 && gradeLevel <= 12) {
                System.out.println("High school");
            }
            if (gradeLevel >= 13 && gradeLevel <= 16) {
                System.out.println("College");
            }
            if (gradeLevel >= 17 && gradeLevel <= 18) {
                System.out.println("Grad School");
            }

        } else {
            System.out.println("Invalid grade level given");

        }
    }
}


