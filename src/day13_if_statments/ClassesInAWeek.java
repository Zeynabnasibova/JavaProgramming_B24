package day13_if_statments;
import java.util.Scanner;
public class ClassesInAWeek {


    /*
    day
    monday, wednesday, thursday, saturday, sunday
        -> java
    tuesday
        -> soft skills
    friday
        -> off
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        ReplitTask.String day = "thursday";
        String day = input.next();

        boolean isTechnicalDay = day.equals("monday") || day.equals("wednesday") || day.equals("thursday") || day.equals("saturday") || day.equals("sunday");

        boolean isSoftSkills = day.equals("tuesday");

        boolean isFriday = day.equals("friday"); // !isTechnicalDay && !isSoftSkills

        if(isTechnicalDay){
            System.out.println("java");
        } else if (isSoftSkills) {
            System.out.println("soft skills");
        } else if(isFriday){
            System.out.println("off day");
        } else {
            System.out.println("Invalid day given");
        }



    }
}
