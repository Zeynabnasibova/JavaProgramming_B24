package tutorialkart.Arrays.JavaArrayOfIntegers;

public class JavaIntegerArray {

    public static void main(String[] args) {

        /*
Java Integer Array
Java Integer Array is a Java Array that contains integers as its elements. Elements of no other datatype are allowed in this array.
         */
/*
How to declare an Integer Array in Java?
Following is the syntax to declare an Array of Integers in Java.
int arrayName[];
or
int[] arrayName;

 */

        /*How to initialize an Integer Array?
        To initialize an integer array, you can assign the array variable with new integer array of specific size
        arrayName = new int[size];
        You have to mention the size of array during initialization. This will create an int array in memory, with all elements initialized to their corresponding static default value.
The default value for an int is 0.
         */

        //Following is an example program to initialize an int array of size 10.

        int numbers[];
        numbers = new int[10];

  //or
        int numbers1[] = new int[10];

        //In the above example, we have created a int array named numbers, and initialized it to an int array of size 10 with default values of 0.

        //declared and initialized int array with elements.
        int numbers2[] = {2, 1, 7, 6, 4, 2, 9};

        //Now numbers is an integer array with size of 7, because there are seven elements in the array we assigned.

        /*
        How to access Integer Array Elements?
Following is the syntax to access an element of an array using index.
arrayName[index]

         */

        //reading the element of int array at index 2.

        int numbers3[] = {2, 1, 7, 6, 4, 2, 9};
        int number3 = numbers3[2];
        System.out.println(number3);//7

        //updating the element of int array at index 2 to 85.

        int numbers5[] = {2, 1, 7, 6, 4, 2, 9};
        numbers5[2] = 85;
        System.out.println(numbers5[2]);











    }
}
