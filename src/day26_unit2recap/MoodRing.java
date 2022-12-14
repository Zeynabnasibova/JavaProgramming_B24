package day26_unit2recap;
import java.util.Locale;
import java.util.Scanner;
public class MoodRing {

    public static void main(String[] args) {

        /*

        You have a mood ring and need to know what mood you are in based on the color. The color will also provide a max budget value that is suggested for shopping

    data:

        pink:
            mood: happy
            budget: 200
        blue:
            mood: relaxed
            budget: 150
        orange:
            mood: nervous
            budget: 50
        red:
            mood: angry
            budget: 0

         */

        Scanner input = new Scanner(System.in);

        System.out.println( " What is the mood ring color?");
        String color  = input.next().toLowerCase().trim();

        String mood = "";
        double budget = 0.0;

        switch(color){

            case "pink":
                mood = "happy";
                budget = 200.0;
                break;
            case "blue":
                mood = "relaxed";
                budget = 150.0;
                break;
            case "orange":
                mood = "nervous";
                budget = 50.0;
                break;
            case "red":
                mood = "angry";
                budget = 0;
                break;
            default:

        }
        System.out.println("Your color was: " + color);
        System.out.println("Which means you " + mood);
        System.out.println("Your mode means you can spend $" + budget);






    }
}
