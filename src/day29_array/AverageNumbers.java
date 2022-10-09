package day29_array;
import java.util.Scanner;
import java.util.Arrays;
public class AverageNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        int size = input.nextInt();

        int [] nums = new int[size];//int [] nums = new int[input.nextInt()];

        for(int i = 0; i < size; i++ ) { // i < nums.length
            System.out.println("Enter number " + (i + 1));
            nums[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        // int [] nums = {4, 6, 2, 10}; // hardcoded number int array

        double sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];  // sum = sum + nums[i]
        }

        System.out.println("Average number is: " + (sum / nums.length));

        // 22 / 4
    }
}
