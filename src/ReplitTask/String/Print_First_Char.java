package ReplitTask.String;
import java.util.Scanner;
public class Print_First_Char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Write a program that will print out first character of the word

         */

        System.out.println("Enter a word");
        String word = input.nextLine();
        //charAt(location/index of the character)
        //System.out.println(word.charAt(0));
        char firstChar = word.charAt( 0 );
        System.out.println(firstChar);


    }
}
