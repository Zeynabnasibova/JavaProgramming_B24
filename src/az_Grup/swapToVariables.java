package az_Grup;
import java.util.Scanner;
public class swapToVariables {
    public static void main(String[] args) {
        /*

        Write a Java program to swap two variables.
         */
        Scanner input = new Scanner(System.in);
        int x, y, z;

        System.out.println("Input first numbrer x =");
        x = input.nextInt();

        System.out.println("Input second number y =");
        y = input.nextInt();

        System.out.println("Swap two numbers");

        z = x ;
        x = y ;
        y = z ;

        System.out.println("Swapped values are: " + " x =" + x + " y = "+ y );


                /*

                Java: Swapping two variables

Swapping two variables refers to mutually exchanging the values of the variables. Generally, this is done with the data in memory.

The simplest method to swap two variables is to use a third temporary variable :

define swap(a, b)
    temp := a
    a := b
    b := temp
                 */


    }
}
