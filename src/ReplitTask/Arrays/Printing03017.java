package ReplitTask.Arrays;

import java.util.Scanner;

public class Printing03017 {
    public static void main(String[] args) {

        /*
        The code provided in your main method will take in six Strings and save them into an array arr.

Print out the 3 neighboring items of the array in one line until the last line each line should contain 3 neighboring items of array element as displayed below

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda"]

Output:
apple, banana, kiwi
banana, kiwi, grape
kiwi, grape, milk
grape, milk, soda
         */

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++) {
            System.out.println("Enter your word " + (i+1));
            arr[i] = input.nextLine();
        }

        String newarr = arr[0] + ", " + arr[1] + ", " + arr[2] + "\n" +arr[1]+ ", " +  arr[2] + ", " + arr[3] + "\n"+  arr[2] + ", " + arr[3] + ", " + arr[4] + "\n" + arr[3] + ", " + arr[4] + ", " + arr[5];

        System.out.println(newarr);



    }
}
