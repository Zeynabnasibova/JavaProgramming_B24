package tutorialkart.Arrays.JavaArrayPrint;

public class PrintArrayElementsusingWhileLoop {
    public static void main(String[] args) {
/*
Algorithm
Following would be the detailed steps to print elements of array.
1.Start.
2.Take array in nums.
3.Initialize an variable for index and initialize it to zero.
4.Check if index is less than length of the array nums. If the condition is false, go to step 7.
5.Access the element nums[index] and print it.
6.Increment index. Go to step 4.
7.Stop.
Java Program – PrintArrayElements.java
 */
        //Java Program - Print Elements of Array
        //array
        int[] nums = {25, 87, 69, 55};

        //while loop to iterate over elements of array
        //index is used to access elements of array
        int index = 0;
        while( index < nums.length ) {
            //get element
            int num = nums[index];
            //work with element
            System.out.println(num);
            //increment index
            index++;
        }
    }
}
