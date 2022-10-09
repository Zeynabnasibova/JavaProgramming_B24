package SamePdfTask.ArrayPractice1;
import java.util.Arrays;
public class numberArray100 {

    public static void main(String[] args) {

        /*
        100 number array
        1.Create an int array called numbers that has length of 100
        2.Assign 1-100 to each index of the array.  Then use a for each loop to print out all the elements of the array
         */

        int [] numbers = new int [100];

        for(int i = 0; i < numbers.length; i++){

            numbers [i] = i + 1;

        }
        System.out.println(Arrays.toString(numbers));
    }
}
