package tutorialkart.Arrays.JavaIterateOverElement;

public class IterateoverArrayElementsWhileLoop {

    public static void main(String[] args) {

        /*
We know that while loop is some what primitive than for loop. If you look at the following program, it is more or less same as that of first example. Just take care the while loop statement’s syntax. And you should get access to each array element one at a time in the loop.

         */
        int[] nums = {25, 86, 41, 97, 22, 34};
        int index=0;
        while(index<nums.length) {
            //access each element in array
            int num = nums[index];
            System.out.println(num);
            index++;
        }

    }
}
