package tutorialkart.Arrays.JavaArrayPrint;

public class PrintArrayElementsusingForLoop {

    public static void main(String[] args) {
/*
Print Array Elements using For Loop
We can use for loop to iterate over array elements and print them during each iteration.
The difference between while loop and for loop is that we write statements to initialize and update loop control variables in the for loop in a single line.
 */
//Java Program - Print Elements of Array
        //array
        int[] nums = {25, 87, 69, 55};

        //for loop to iterate over elements of array
        for(int index = 0; index < nums.length; index++) {

            //get element
            int num = nums[index];

            //work with element
            System.out.println(num);

        }
    }
}
