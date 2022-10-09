package SamePdfTask.MidUnit2Recap;
import java.util.Locale;
import java.util.Scanner;
public class MoodRingSwitch {

    public static void main(String[] args) {

        /*

        Mood Ring [Switch]

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
        System.out.println("Enter your color");
        String color = input.nextLine().toLowerCase().trim();
        String mood = "";
        int budget = 0;

        switch(color){

            case "pink":
                mood = "happy";
                budget = 200;
                break;
            case "blue":
                mood = "relaxed";
                budget = 150;
                break;
            case "orange" :
                mood = "nervous";
                budget = 50;
                break;
            case "red":
                mood = "angry";
                budget = 0;
                break;
            default:
        }
                System.out.println("Your color is: " + color);
                System.out.println("You are: " + mood);
                System.out.println("Yoour budget is: $"+ budget);





    }
}
