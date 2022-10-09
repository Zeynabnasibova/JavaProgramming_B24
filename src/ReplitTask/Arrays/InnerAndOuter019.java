package ReplitTask.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InnerAndOuter019 {

    public static void main(String[] args) {

        /*
        Given two arrays of ints sorted in increasing order, outer and inner, print out true if all of the numbers in inner appear in outer. Take advantage of the fact that both arrays are already in sorted order.

Examples:

input (outer): 1, 2, 4, 6
input (inner): 2, 4

output: true

input (outer): 1, 2, 4
input (inner): 6, 5

output: false
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your outer length");
        int[] outer = new int[scan.nextInt()];
        System.out.println("Enter your inner length");
        int[] inner = new int[scan.nextInt()];

        System.out.println(Arrays.toString(outer));
        System.out.println(Arrays.toString(inner));

        for(int j = 0; j < outer.length; j++) {
            System.out.println("Enter your outer number" +(j+1));
            outer[j] = scan.nextInt();
        }

        for(int i = 0; i < inner.length; i++) {
            System.out.println("Enter your inner number" + (i+1));
            inner[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(outer));
        System.out.println(Arrays.toString(inner));

        Arrays.sort(inner);
        Arrays.sort(outer);

        System.out.println(Arrays.toString(outer));
        System.out.println(Arrays.toString(inner));

        //WRITE YOUR CODE HERE

        boolean bl =false;

        for(int i =0; i <inner.length; i++){

            bl =false;

            for( int j =0 ; j < outer.length; j++){

                if(outer[j] == inner[i]){

                    bl=true;

                    break;

                }
            }
        }
        System.out.println(bl);
    }
}