package day31_array;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseSentense {

    public static void main(String[] args) {

    /*


     */
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();

        String []  words = str.split(" ");

        String reverse = "";

        for(int i = words.length-1; i >= 0; i--){

            reverse += words[i] + " ";


        }

        System.out.println(reverse.trim());
}

}
