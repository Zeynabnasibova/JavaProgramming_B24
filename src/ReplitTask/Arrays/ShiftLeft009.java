package ReplitTask.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ShiftLeft009 {

    public static void main(String[] args) {

        /*
        Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.`

Example:

input: 6, 2, 5, 3

output: [2, 5, 3, 6]
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your arrays length");
        int size = scan.nextInt();
        int[] nums = new int[size];
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < size; i++){
            System.out.println("Enter your number " + (i +1));
            nums[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        //WRITE YOUR CODE HERE

        int [] newNums = new int [size];
       // System.out.println(Arrays.toString(newNums));

        if(nums.length==1) {
            newNums = nums;
            System.out.println(Arrays.toString(newNums));
        }else{
        for(int i =0; i < nums.length-1; i++){

                newNums [i] = nums[i+1];

                newNums[newNums.length-1] = nums[0];

            }
            System.out.println(Arrays.toString(newNums));
        }



    }
}
//            newNums[0] = nums[1];
//            newNums[1] = nums[2];
//            newNums[2] = nums[3];
//            newNums[3] = nums[0];

/*
input: 6, 2, 5, 3

output: [2, 5, 3, 6]

 */