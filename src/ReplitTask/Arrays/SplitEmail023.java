package ReplitTask.Arrays;
import  java.util.Scanner;
public class SplitEmail023 {

    public static void main(String[] args) {
        /*
        Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com

If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email

email -> my@fancy@email.com

Output:
invalid email
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = input.nextLine();

        //Write your code below

        String [] emailArr = email.split("@");



    if(!email.contains("@") || !email.contains("@@")){

        System.out.println("invalid email");

        System.out.println("Email id: " + emailArr[0] );
        System.out.println("Email domain: " + emailArr[1]);

}


    }
}
