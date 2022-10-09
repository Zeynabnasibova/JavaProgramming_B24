package ReplitTask.Variables;
import java.util.Scanner;
public class SchoolGrades {
    public static void main(String[] args) {

        /*
        Write the program that will calculate the average grade. Use 5 ReplitTask.String variables and 6 double variables to hold the subject and the grade value. Build a summary with all the information by concatenating the subjects and grades. Then calculate the average grade and print display the average score too.

Execution flow with example:

```
Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4

Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!
         */
        Scanner scan = new Scanner(System.in);
            String name1 = "Math",
                    name2 = "Biology",
                    name3 = "English",
                    name4 = "Chemistry",
                    name5 = "Music";
            double score1 = 5.0,
                    score2 = 5.2,
                    score3 = 4.8,
                    score4 = 4.8,
                    score5 = 5.2,
                    averaceScore;

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
         name1 = scan.next();
         score1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        name2 = scan.next();
        score2 =scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        name3 = scan.next();
        score3 = scan.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        name4 = scan.next();
        score4 = scan.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        name5 = scan.next();
        score5 = scan.nextDouble();

        averaceScore = (score1 + score2 + score3 + score4 + score5)/5;

        System.out.println("Summary: " + name1 + " - " + score1 + ", " + name2 + " - " + score2 + ", " + name3 + " - " + score3 + ", " + name4 + " - " + score4 + ", " + name5 + "- " + score5 );
        System.out.println("Your average score is: " + averaceScore);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");





    }
}
