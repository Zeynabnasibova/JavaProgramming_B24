package ReplitTask.Variables;

 /*
         int areaCode = input.nextInt();
        areaCode = 222;
        hours,
        minutes,
        seconds;

         */
import java.util.Scanner;
public class SecondConverter {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int inputSecond,
                hours = 1,
                minute = 1,
                seconds = 35;
        System.out.println("Enter seconds:");
        inputSecond = scan.nextInt();

        hours = inputSecond / 3600;
        inputSecond %= 3600;

        minute = inputSecond / 60;
        inputSecond %= 60;

        seconds = inputSecond;

        System.out.println(hours + " hours, " + minute + " minutes, " + "and " + seconds + " seconds");




    }
}
