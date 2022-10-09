package w3resource.com.Array;
import java.util.Arrays;
public class Q10 {
    public static void main(String[] args) {

/*
Write a Java program to find the maximum and minimum value of an array.
 */


        int[] arr = {9, 1, 3, 2};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for ( int i = 0; i < arr.length; i++){



            if(arr[i] < min){

                min = arr[i];


            }else{
                max = arr[i];

            }
        }
        System.out.println(min);
        System.out.println(max);

//        int[] arr = {9, 1, 3, 2};
//
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//
//
//        }
//        System.out.println("Minimum number :" + arr[0]);
//        System.out.println("Maximum number: " + arr[arr.length-1]);
   }
}
