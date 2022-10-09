package SamePdfTask.ProblemSet1;
import java.util.Scanner;
public class OfficeHoursScheduleSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



    /*
    Given some Day(ReplitTask.String) print out the office hours schedule for that day if there is office hours.
        Monday, Thursday, Wednesday:
            Print: Office hours at 5:30 -6:45 EST
        Tuesday:
            Print: Soft Skills day
        Friday:
            Print: Day off
        Saturday, Sunday:
            Print: Already a long day, no office hours.
        Any other ReplitTask.String:
            Print: Invalid day given
     */

            String msg = "";

            System.out.println("Enter the day of the week: ");
            String dayOfWeek = scan.next();

            switch (dayOfWeek) {
                case "Monday":
                case "Wednesday":
                case "Thursday":
                    //System.out.println("Office hours at 5:30 -6:45 EST")
                    msg = "Office hours at 5:30 -6:45 EST";
                    break;
                case "Tuesday":
                    msg = "oft Skills day";
                    break;
                case "Friday":
                    msg = "Day off";
                    break;
                case "Saturday":
                case "Sunday":
                    msg = "Already a long day, no office hours.";
                    break;
                default:
                    msg = "Invalid day given";
            }

        System.out.println(msg);

            /*

            ReplitTask.String day = "Friday";
            switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            System.out.println("Office hours at 5:30 -6:45 EST");
            break;
            case "Thursday":
            System.out.println("Soft Skills day");
            break;
            case "Friday":
            System.out.println("Day off");
            break;
            case "Saturday":
            case "Sunday":
            System.out.println("Already a long day, no office hours.");
            break;
            default:
            System.out.println("Invalid day given");}
             */

        }
    }
