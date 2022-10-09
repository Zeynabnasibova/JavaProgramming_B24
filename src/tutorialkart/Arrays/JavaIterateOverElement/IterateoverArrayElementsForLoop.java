package tutorialkart.Arrays.JavaIterateOverElement;

public class IterateoverArrayElementsForLoop {

    public static void main(String[] args) {

        /*
        In this example, we declare and initialize an integer array nums with some elements, to be precise six elements. What we shall do is, employ a for loop. The for loop has an index variable starting with an initial value of zero and increment in steps of one until we reach end of the array.
As the index of the array also ranges from zero until its length, we shall use the variable index to access elements of the array, one by one.
         */


        /**
         * Java Example Program to iterate over Array Elements
         */
                int[] nums = {25, 86, 41, 97, 22, 34};
                for(int index = 0; index < nums.length; index++) {
                    //access each element using index
                    int num = nums[index];
                    System.out.println(num);
                }

    }

}
