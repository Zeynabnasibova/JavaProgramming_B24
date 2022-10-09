package w3resource.com.ConditionalStatement;
import java.util.Scanner;
public class Q13 {

    public static void main(String[] args) {

        /*
        Write a program in Java to display the cube of the number upto given an integer.

Test Data
Input number of terms : 4
Expected Output :

Number is : 1 and cube of 1 is : 1
Number is : 2 and cube of 2 is : 8
Number is : 3 and cube of 3 is : 27
Number is : 4 and cube of 4 is : 64
         */
        Scanner input = new Scanner(System.in);

        int numOfTerms = input.nextInt();

        String str = "";

        for(int i = 0; i < numOfTerms; i++){

            str = "Number is : " + (i +1) +" and cube of " + (i + 1) + " is : "  + (i + 1) * (i + 1) * (i + 1) ;

            System.out.println(str);

        }






    }
}
