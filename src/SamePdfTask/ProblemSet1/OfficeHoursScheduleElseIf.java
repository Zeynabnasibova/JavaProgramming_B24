package SamePdfTask.ProblemSet1;
import java.util.Scanner;
public class OfficeHoursScheduleElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        [Office Hours Schedule]
        Given some Day(ReplitTask.String) print out the office hours schedule for that day if there is office hours.
        Monday,Tuesday,Wednesday:
        Print: Office hours at 5:30 -6:45 EST
        Thursday:
        Print: Soft Skills day
        Friday:
         Print: Day off
         Saturday, Sunday:
         Print: Already a long day, no office hours.
         Any other ReplitTask.String:
         Print: Invalid day given
         */

        System.out.println("Office Hours Schedule");

        System.out.println("Input day");

        String day = input.nextLine();

        if (day.equals("Monday")  || day.equals("Tuesday") ||  day.equals("Wednesday")) {
            System.out.println("Office hours at 5:30 -6:45 EST");
            //System.exit(0);

        }else if(day.equals("Thursday")) {
            System.out.println("Soft Skills day");

        } else if (day.equals("Friday")) {
            System.out.println("Day off");

        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("Already a long day, no office hours.");

        }else{
            System.out.println("Ivalid day given");
        }

    }
}

