package tutorialkart.Arrays.JavaArrayPrint;

public class PrintArrayElementsusingAdvancedForLoop {

    public static void main(String[] args) {
/*
In the following program, we shall iterate over the array nums. During each iteration, we get the element to variable num.
Java Program – PrintArrayElements.java
 */
        int[] nums = {25, 87, 69, 55};

        //advanced for loop to iterate over elements of array
        for (int num : nums) {

            System.out.println(num);

        }
    }
}