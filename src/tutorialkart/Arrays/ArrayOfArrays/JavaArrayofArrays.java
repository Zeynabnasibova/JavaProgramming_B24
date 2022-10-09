package tutorialkart.Arrays.ArrayOfArrays;

public class JavaArrayofArrays {

/*
Java – Array of Arrays
You can define an array of arrays in Java. Outer array contains arrays elements. Inner arrays is just like a normal array of integers, or array of strings, etc.
 */

    /*
    Declare Array of Arrays
The syntax to declare an Array of Arrays in Java is
datatype[][] arrayName;
The second set of square brackets declare that arrayName is an array of elements of type datatype[].
For example, int[][] numbers, declares that numbers is an array of elements that are of datatype int[].
     */


    /*
    Initialize Array of Arrays
To initialize an array of arrays, you can use new keyword with the size specified for the number of arrays inside the outer array.\
datatype[][] arrayName = new datatype[size][];
In the array of arrays, you can have elements only of the specified datatype. Elements of no other datatype are allowed, just like in one dimensional arrays
For example, the following line of code

     */

    int[][] numbers = new int[3][];

/*

specifies that numbers is an array of arrays that store integers. Also, numbers array is of size 3, meaning numbers array has three arrays inside it. The size of the inner arrays can be different from each other.
Another way of initializing an array of arrays is to assign a list of lists to the array.
datatype[][] arrayName = { {element, element, ..}, {element, element, ..}, {element, element, ..} };

 */

    int[][] numbers1 = { {2, 3, 7, 1}, {9, 8, 6, 7}, {1, 7, 6, 4, 8} };





}
