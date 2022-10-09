package w3resource.com.ConditionalStatement;
import java.util.Scanner;
public class Q5 {

    public static void main(String[] args) {

        /*
        Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. Go to the editor

Test Data
Input number: 3
Expected Output :
Wednesday

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");

        int num = input.nextInt();

        if (num == 1){
            System.out.println("Monday");
        }else if (num == 2){
            System.out.println("Tuesday");
        }else if (num == 3){
            System.out.println("Wednesday");
        }else if (num == 4){
            System.out.println("Thursday");
        }else if(num == 5){
            System.out.println("Friday");
        }else if(num == 6){
            System.out.println("Saturday");
        }else if (num == 7){
            System.out.println("Sunday");
        }
    }
}
