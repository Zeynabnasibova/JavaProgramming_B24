package ReplitTask.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ShiftLeft009Leyla {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int firstNum = nums[0];

        for ( int i = 0; i < nums.length-1; i++) {
            nums [i] = nums [i+1];
        }
        nums [nums.length-1] = firstNum;
        System.out.println(Arrays.toString(nums));


    }
}
