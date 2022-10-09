package w3resource.com.ConditionalStatement;
import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first num");
        int num1 = input.nextInt();
        System.out.println("Enter your second num");
        int num2 = input.nextInt();
        System.out.println("Enter your third num");
        int num3 = input.nextInt();


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if(num1 > num2 && num1 > num3){

          max = num1;
            System.out.println(max);

        }else if(num2 > num1 && num2 > num3){

            max = num2;
            System.out.println(max);

        }else if(num3 > num1 && num3 > num2 ){

             max = num3;
            System.out.println("Your max number is: " + max);
        }

    }
}
