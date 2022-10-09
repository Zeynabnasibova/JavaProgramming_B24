package ReplitTask.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class FrontPrice002 {
    public static void main(String[] args) {

        /*
        Given an int array num of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

Examples:

input: 1, 2, 3

output: [1, 2]

input: 1

output: [1]

input: 4, 5, 4, 3, 8

output: [4, 5]
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your arrays length");
        int lengthSize = scan.nextInt();
        int[] num = new int[lengthSize];
        for(int i =0; i < lengthSize; i++) {
            System.out.println("Enter your number " + (i+1));
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        System.out.println(Arrays.toString(num));

        int [] newNum = new int [2];

        if(lengthSize >= 2){
            newNum[0] = num [0];
            newNum[1] = num[1];
            System.out.println(Arrays.toString(newNum));
        }else{
            System.out.println(Arrays.toString(num));
        }

    }
}
