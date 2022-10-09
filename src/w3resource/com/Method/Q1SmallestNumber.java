package w3resource.com.Method;
import java.util.Scanner;
public class Q1SmallestNumber {

  public static int number(int num1, int num2, int num3){

        /*
        Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0
         */

Scanner input = new Scanner(System.in);

      System.out.println("Enter your first number");
      num1 = input.nextInt();
      System.out.println("Enter your second number");
      num2 = input.nextInt();
      System.out.println("Enter your third number");
      num3 = input.nextInt();
//      num1 = 3;
//      num2 = 6;
//      num3 = 9;

     int smallest ;

      if(num1 < num2 && num1 < num3){
         smallest = num1;
      }else if(num2 < num1 && num2 < num3){
          smallest = num2;
      }else {
       smallest = num3;
      }

      System.out.println(smallest + " is the smallest.");
            return smallest;

    }

    public static void main(String[] args) {
         number(3,6,9);
    }

}

