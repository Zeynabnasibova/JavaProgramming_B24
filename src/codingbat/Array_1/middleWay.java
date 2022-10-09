package codingbat.Array_1;

import java.util.Arrays;

public class middleWay {
     /*
        Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
         */

    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = {4, 5, 6};

        middleWay(a,b);
    }

    public static int[] middleWay(int[] a, int[] b) {

        a = new int [3];
        b = new int [3];

         int [] newArray = new int [2];

        int  midlea = a[a.length/2];
        int midleb = b[b.length/2];

        newArray = new int []{midlea,midleb};

       // for(int eachMidle : midlea){

      //  }


        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

}
