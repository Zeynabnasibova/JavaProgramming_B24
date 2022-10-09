package SamePdfTask.ProblemSet1;
import java.util.Scanner;
public class TernaryMorningOrNight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        [Morning or Night]
        Given some time value (int) in 24 hours format. Print if its the morning or night.
        0 -11 : Morning
        12-24 : Night
        -> You can assume the value given is always valid (in the 24 hours range), but if you want a challenge use an if to control invalid values
         */

        // 24 hour format

        int hour = input.nextInt();


        // 11 and before is good morning
        if (hour < 12 && hour >= 6) {
            System.out.println("Good morning");
       }

        // hour is between 12 - 15 afternoon  -> 3 pm is 15:00


        if (hour >= 12 && hour < 15) {
            System.out.println("Good afternoon");
        }

        // 15 + is evening

        if (hour >= 15 && hour < 22) {
            System.out.println("Good evening");
        }

        if ((hour >= 22 && hour <= 24) || (hour >= 0 && hour < 6)) { // 10 pm - 12 || 1 - 6 am
            System.out.println("Good night");

            /*

            int time = 8;
            ReplitTask.String morningOrNight = time > 0 && time < 12 ? "Morning" : "Night";
             */

        }
    }
}
