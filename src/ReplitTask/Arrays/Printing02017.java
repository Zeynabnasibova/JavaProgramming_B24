package ReplitTask.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Printing02017 {

    public static void main(String[] args) {

        /*
        The code provided in your main method will take in eight Strings and save them into an array arr.

Print out the 4 lines using for loop: each line should contain a pair of array elements

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"]

Output:
apple , banana
kiwi , grape
milk, soda
juice, coffee
         */


        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++) {
            System.out.println("Enter your words " + (i+1));
            arr[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(arr));



            String newarr = arr[0] + ", " + arr[1] + "\n" + arr[2] + ", " + arr[3] + "\n" + arr[4] + ", " + arr[5] + "\n" + arr[6] + ", " + arr[7];

            System.out.println(newarr);




    }
}
