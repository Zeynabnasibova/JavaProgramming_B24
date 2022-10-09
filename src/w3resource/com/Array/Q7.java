package w3resource.com.Array;
import java.util.Arrays;
public class Q7 {
/*
Write a Java program to remove a specific element from an array.
 */
    public static void main(String[] args) {


        int [] num = new int [] { 4, 6, 8, 9};

        System.out.println(Arrays.toString(num));

        int removeIndex = 1;

        for (int i = removeIndex; i < num.length - 1; i++){

            num[i] = num[i +1];


        }
    }



}
