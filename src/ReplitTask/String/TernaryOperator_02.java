package ReplitTask.String;
import java.util.Scanner;
public class TernaryOperator_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*

        Write an expresion using the conditional operator( ? :) that compares the values of the variables num1 and num2. The result(that is the value) of this expression should be the value of the larger of the two variables.The larger value should be printed out.
         */

        System.out.println("Enter number1:");
        int num1 = input.nextInt();

        System.out.println("Enter number2:");
        int num2 = input.nextInt();

       // int bigger = (num1 > num2) ? num1 : num2;
      //  System.out.println(bigger);
        System.out.println((num1 > num2) ? num1 : num2);


    }
}
