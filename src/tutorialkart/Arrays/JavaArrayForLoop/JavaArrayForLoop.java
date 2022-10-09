package tutorialkart.Arrays.JavaArrayForLoop;

public class JavaArrayForLoop {

    public static void main(String[] args) {
        /*
        Java Array is a collection of elements stored in a sequence. You can iterate over the elements of an array in Java using any of the looping statements.
         */
/*

In the following program, we initialize an array, and traverse the elements of array using for loop. We start with an index of zero, condition that index is less than the length of array, and increment index as update expression in for loop.

During each iteration, we have access to index and the array itself, using which we can access an element from starting in each of the iterations.
 */

        int[] numbers = {2, 4, 6, 8, 10};
        for (int index=0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
/*

Example 2 – Iterate Java Array using Enhanced For Loop
In the following program, we initialize an array, and traverse the elements using enhanced for loop.
 */
        System.out.println();

        int[] numbers1 = {2, 4, 6, 8, 10};
        for (int n: numbers1) {
            System.out.println(n);
        }


        /*

During each iteration of for loop, you can access this element using the variable name you provided in the definition of for loop. In the above program, we used the variable n, to store current element during this iteration.

         */

        /*
Example 3 – Iterate Java Array from End to Start using For Loop
You can also traverse through an array from end to start. All you have to do is initialize the index that points to last element of the array, decrement it during each iteration, and have a condition that index is greater than or equal to zero.

In the following program, we initialize an array, and traverse the elements of array from end to start using for loop.

         */
        System.out.println();

        int[] numbers2 = {2, 4, 6, 8, 10};
        for (int index = numbers2.length -1; index >= 0; index--) {
            System.out.println(numbers2[index]);
        }
    }
}
