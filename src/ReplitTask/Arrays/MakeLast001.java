package ReplitTask.Arrays;
import  java.util.Scanner;
import  java.util.Arrays;
public class MakeLast001 {

    public static void main(String[] args) {

        /*
        Given an int array nums print a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Hint: by default, a new int array contains all 0's.

Examples:

input: 4 5 6

output: [0, 0, 0, 0, 0, 6]

input: 0

output: [0, 0]

input: 1 2 3 4

output: [0, 0, 0, 0, 0, 0, 0, 4]
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your array length");
        int size = scan.nextInt();

        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            System.out.println("Enter your nums");
            nums[i] = scan.nextInt();

        }
        //WRITE YOUR CODE HERE

        int [] newNums = new int[size * 2];

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(newNums));


        newNums [newNums.length-1] = nums[nums.length-1];

        System.out.println(Arrays.toString(newNums));

    }
}

