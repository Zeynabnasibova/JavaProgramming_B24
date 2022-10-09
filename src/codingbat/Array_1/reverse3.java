package codingbat.Array_1;

import java.util.Arrays;

public class reverse3 {

    /*
    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
     */
public static int [] reverse3(int[] nums) {


    int reverse = 0;

    for(int i = nums.length-1;i >=0;i--){

        reverse = nums[i];

        System.out.print(reverse);



    }

    return nums;

}

    public static void main(String[] args) {

    int [] num = {5, 11, 9};

        reverse3(num);
    }


}
