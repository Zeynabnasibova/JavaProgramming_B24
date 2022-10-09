package ReplitTask.Variables;
import java.util.Scanner;
public class Time {
    /*
    In this assignment, you will write code to put together time of day.

Like this: 12:24:33 PM

Declare variables: hour, minute, second that can hold int values.
Declare amOrPm variable that can hold a ReplitTask.String ("AM" or "PM")
Instructor will set different values to your variables
Using the variables and concatenation, print values in the format mentioned above.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = 12;
        int minute = 24;
        int second = 33;
        String amOrPm = "PM";

        hour = scan.nextInt();
        minute = scan.nextInt();
        second = scan.nextInt();

        amOrPm = scan.next();


        System.out.println(hour+":"+minute+":"+second+" "+amOrPm);

    }
}
