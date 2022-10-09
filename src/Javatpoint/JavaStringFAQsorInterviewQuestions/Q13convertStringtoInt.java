package Javatpoint.JavaStringFAQsorInterviewQuestions;
import java.util.Scanner;
public class Q13convertStringtoInt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your firs String number");
        String num1 = input.nextLine();
        System.out.println("Enter your second String number");
        String num2 = input.nextLine();
//      String newNum = "200";
        int newNum1 = Integer.parseInt(num1);
        int newNum2 = Integer.parseInt(num2);

//        System.out.println(num1 + 100);
//        System.out.println(newNum1 + 100);

        System.out.println(newNum1 + " " + " \n" + newNum2);

    }
}
