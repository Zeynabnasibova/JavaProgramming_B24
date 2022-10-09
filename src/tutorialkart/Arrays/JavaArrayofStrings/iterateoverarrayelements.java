package tutorialkart.Arrays.JavaArrayofStrings;

public class iterateoverarrayelements {

    public static void main(String[] args) {


        /*
        How to iterate over array elements?
We can use any of these looping statements like For Loop or While Loop to iterate over elements of a Java Array.
         */

        String names[] = {"apple", "banana", "cherry", "orange", "mango"};

        int index = 0;

        while (index < names.length) {

            System.out.println(names[index]);

            index++;
        }


        //we will iterate over elements of String Array using Java For Loop.


        String names1[] = {"apple", "banana", "cherry", "orange", "mango"};

        for (int index1 = 0; index1 < names.length; index1++) {

            System.out.println(names1[index1]);

        }

        // we will use Java for-each loop, to iterate over elements of string array.

        String names2[] = {"apple", "banana", "cherry", "orange", "mango"};

        for (String eachname: names2) {

            System.out.println(eachname);



        }
    }
}
