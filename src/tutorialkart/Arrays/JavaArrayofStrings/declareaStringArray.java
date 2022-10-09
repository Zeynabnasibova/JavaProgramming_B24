package tutorialkart.Arrays.JavaArrayofStrings;

import java.util.Arrays;

public class declareaStringArray {
    public static void main(String[] args) {

        /*
        Java Array of Strings
Java String Array is a Java Array that contains strings as its elements. Elements of no other datatype are allowed in this array.
         */

        /*
        How to declare a String Array?
Following is the syntax to declare an Array of Strings in Java.
string arrayName[];
or
string[] arrayName;

         /*
         How to initialize a String Array?
To initialize a string array, you can assign the array variable with new string array of specific size as shown below.
arrayName = new string[size];
You have to mention the size of array during initialization. This will create a string array in memory, with all elements initialized to their corresponding static default value.
The default value for a string is empty string “”.
         */

        //initialize a string array of size 10.

        String names[];

        names = new String[10];

        //or

        String names1[] = new String[10];

        System.out.println(Arrays.toString(names1));

        //In the above example, we have created a string array named names, and initialized it to a string array of size 10 with default values of empty strings.

        //declared and initialized string array with elements.

        String names2[] = {"apple", "banana", "cherry", "orange", "mango"};

        System.out.println(Arrays.toString(names2));
        /*

        How to access String Array Elements?
Following is the syntax to access an element of an array using index.
arrayName[index]
The above statement can be used either to read an element at given index, or set an element at given index.
         */

        String names3[] = {"apple", "banana", "cherry", "orange", "mango"};

        String name3 = names3[2];

        System.out.println(name3);

        //updating the element of string array at index 2 to “lychee”.


        String names4[] = {"Akhil", "Honey", "Lucky", "Sushanth"};
        names[2] = "lychee";
        System.out.println(names4[2]);



    }
}