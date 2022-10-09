package Javatpoint.JavaStringFAQsorInterviewQuestions;
import java.util.Scanner;
public class Q14ConvertInttoString {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();

      //  int num = 47;
        String newNum1 = String.valueOf(num1);
        String newNum2 = String.valueOf(num2);

        System.out.println(newNum1 + newNum2);


    }
}
