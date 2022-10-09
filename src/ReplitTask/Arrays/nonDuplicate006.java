package ReplitTask.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class nonDuplicate006 {

    public static void main(String[] args) {

        /*
        Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers");
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        System.out.println(Arrays.toString(nums));
        //TODO: write your code below



        for (int i = 0; i < nums.length; i++) {

            int uniqueCount = 0;
//uniqueCount = 0;

            for(int j = 0; j < nums.length;j++){

                if(nums[i] == nums[j]){

                    uniqueCount++;

                }
            }

            if(uniqueCount == 1){

                System.out.println(nums[i]);

            }

        }

    }
}
