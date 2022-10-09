package w3resource.com.Array;

import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {

        /*
        Write a Java program to sort a numeric array and a string array.
         */

        String [] arr = {"b", "c", "k", "Z"};
        int [] arrNum = {5, 2, 4, 4, 6};

        Arrays.sort(arr);
        Arrays.sort(arrNum);


        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arrNum));

    }
}
