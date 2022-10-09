package SamePdfTask.StringPractice2;
import java.util.Locale;
import java.util.Scanner;
public class CreatingAnEmail {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        [Creating an email]
        Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.
        If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and print the final string as your created email. The final email should be in all lowercase.
         */

        System.out.println("Enter first word");
        String firstWord = input.nextLine().toLowerCase(Locale.ROOT);

        System.out.println("Enter second word");
        String secondWord = input.nextLine().toLowerCase(Locale.ROOT);

        if(firstWord.length()>6 || secondWord.length()>6){
            System.out.println("Invalid data");
        }else
            System.out.println(" " + firstWord.substring(0,4) + secondWord.substring(secondWord.length()-3) + "@cybertek.com");

    }
}
