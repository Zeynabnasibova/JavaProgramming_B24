package office_hours.practice_08_26_2021;
import java.util.Scanner;
public class CreateEmail {
    public static void main(String[] args) {

        /*
        [Creating an email]
Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.
If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and print the final string as your created email. The final email should be in all lowercase.
James Bond Jamie Bond

input: JamesBond Secret output: jameret@cybertek.com
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a ReplitTask.String");
        String wordOne = input.nextLine();

        System.out.println("Enter a ReplitTask.String");
        String wordTwo = input.nextLine();


        String email = "";
        if(wordOne.length() >= 6 && wordTwo.length() >= 6){

           email += wordOne.substring(0,4);//

           email += wordTwo.substring(wordTwo.length() -3);//

            email += "@cybertek.com";

        }else{
            System.out.println("Invalid data");
        }
        System.out.println(email.toLowerCase());


    }
}
