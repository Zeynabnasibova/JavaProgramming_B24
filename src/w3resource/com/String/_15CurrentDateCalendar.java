package w3resource.com.String;
import java.util.Calendar;
public class _15CurrentDateCalendar {

    public static void main(String[] args) {

        /*
        Write a Java program to print current date and time in the specified format.
        N.B. : The current date and time will change according to your system date and time.

         */
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date and Time :");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);





    }
}
