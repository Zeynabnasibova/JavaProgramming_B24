package ProgrammizCom.JavaFlowControl;

public class JavaforeachLoop {

    public static void main(String[] args) {

        /*
        Java for-each Loop

In this tutorial, we will learn about the Java for-each loop and its difference with for loop with the help of examples.

In Java, the for-each loop is used to iterate through elements of arrays and collections (like ArrayList). It is also known as the enhanced for loop.

for-each Loop Sytnax

The syntax of the Java for-each loop is:

for(dataType item : array) {
    ...
}
Here,

array - an array or a collection
item - each item of array/collection is assigned to this variable
dataType - the data type of the array/collection
Example 1: Print Array Elements
         */


        // create an array
        int[] numbers = {3, 9, 5, -5};

        // for each loop
        for (int number: numbers) {
            System.out.println(number);
        }

        /*
        Output

3
9
5
-5
Here, we have used the for-each loop to print each element of the numbers array one by one.

In the first iteration, item will be 3.
In the second iteration, item will be 9.
In the third iteration, item will be 5.
In the fourth iteration, item will be -5.
Example 2: Sum of Array Elements
         */
        // an array of numbers
        int[] numbers1 = {3, 4, 5, -5, 0, 12};
        int sum1 = 0;

        // iterating through each element of the array
        for (int number1: numbers1) {
            sum1 += number1;
        }

        System.out.println("Sum1 = " + sum1);
        /*
        Output:

Sum = 19
In the above program, the execution of the for each loop looks as:

Iteration	Variables
1	number = 3
sum = 0 + 3 = 3
2	number = 4
sum = 3 + 4 = 7
3	number = 5
sum = 7 + 5 = 12
4	number = -5
sum = 12 + (-5) = 7
5	number = 0
sum = 7 + 0 = 7
6	number = 12
sum = 7 + 12 = 19
As we can see, we have added each element of the numbers array to the sum variable in each iteration of the loop.

for loop Vs for-each loop
         */

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // iterating through an array using a for loop
        for (int i = 0; i < vowels.length; ++ i) {
            System.out.println(vowels[i]);
        }
        /*
        Output:

a
e
i
o
u
2. Using for-each Loop
         */
        char[] vowels2 = {'a', 'e', 'i', 'o', 'u'};

        // iterating through an array using the for-each loop
        for (char item2: vowels2) {
            System.out.println(item2);
        }
        /*
        Output:

a
e
i
o
u
Here, the output of both programs is the same. However, the for-each loop is easier to write and understand.

This is why the for-each loop is preferred over the for loop when working with arrays and collections.
         */
    }
}
