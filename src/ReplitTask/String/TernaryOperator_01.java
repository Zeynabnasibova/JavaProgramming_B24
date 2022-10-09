package ReplitTask.String;
import java.util.Scanner;
public class TernaryOperator_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");


        /*

        Write an expression using the conditional operator (?:) that compare the value of the variable x to 5 and results in:
        Display x if x greater than or equal to 5
        Display -x if x is less than 5

         */
        System.out.println("Input x");
        int x = input.nextInt();
//
//        if(x >= 5 ){
//            System.out.println(x);
//        }else{
//            System.out.println(-x);

        int display = (x >= 5 ) ? x : -x;

        System.out.println(display);

    }
}
