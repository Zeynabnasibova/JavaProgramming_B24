package ReplitTask.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class FindSum007 {

    public static void main(String[] args) {

/*
Given an array num, calculate the sum of all numbers in the array and print out to the console.

nums → [2, 1, 2, 3, 4]) → 12
nums → [2, 2, 0, 3, 5]) → 12
nums → [1, 3, 5, 7, 9]) → 25
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers");
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        System.out.println(Arrays.toString(nums));
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below

        int sum = 0;

        for(int i = 0; i < nums.length; i++){

            sum += nums[i];

        }
        System.out.println(sum);


    }
}
