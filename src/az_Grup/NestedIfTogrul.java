package az_Grup;
import java.sql.SQLOutput;
import java.util.Scanner;
public class NestedIfTogrul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        To qualify for a mortgage, the applicant should have a FICO score equal to or above 600. Also, the applicant should not get unemployment benefit. If the score of the applicant is between 450 (450 included) and 600, doesn't receive an unemployment benefit and has served in the military, he
qualifies for the mortgage. If the applicant qualifies for the mortgage, print "Congrats on your new house".If he doesn't qualify, print "Sorry, try next time".
         */

        System.out.println("To qualify for a mortgage");
        System.out.println("Enter your credit score");
        int fico = input.nextInt();

        System.out.println("Are you unemployed?");
        boolean unemployment = input.nextBoolean();

        System.out.println("Have you served in military");
        boolean military = input.nextBoolean();

        if (!unemployment) {
            if (fico >= 600) {
                System.out.println("Congrats, you qualify");

            } else if (fico >= 450 && fico < 600) {
                if (military) {
                    System.out.println("Congrats, you qualify");
                } else {
                    System.out.println("You need to serve in the army");
                }
            } else {
                System.out.println("Your FICO is too low");
            }
        } else {
            System.out.println("You shouldn't be an unemployment recipient");
        }
    }
}
