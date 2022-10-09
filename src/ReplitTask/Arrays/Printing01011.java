package ReplitTask.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Printing01011 {

    /*
    The code provided in your main method will take in five Strings and save them into an array called arr. Print out the first three letter of each element on seperate lines. You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["hello", "how", "are", "you", "doing"]

Output:
hel
how
are
you
doi
     */

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++) {
            System.out.println("Enter your word " + (i + 1));
            arr[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(arr));
        //leave above alone!  write your code below.
        //Create another loop for your solution!

        for(int i = 0; i < arr.length;i++){
            String newArr = arr[i].substring(0,3);
            System.out.println(newArr);
        }



    }


}
