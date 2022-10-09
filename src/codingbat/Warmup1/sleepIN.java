package codingbat.Warmup1;
import java.util.Scanner;
public class sleepIN {

/*

The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */

public static boolean sleepIn (boolean weekday, boolean vacation) {

Scanner input = new Scanner(System.in);
    System.out.println("Is it a weekday?");
weekday = input.nextBoolean();
    System.out.println("Are you in vacation?");
vacation = input.nextBoolean();

    if (!weekday || vacation ) {
        System.out.println(true);
        return true;
    }else if(weekday && vacation){
        System.out.println(true);
        return true;
    }else {
        System.out.println(true);
        return false;

    }

}

    public static void main(String[] args) {

sleepIn(true,true);

    }

}
