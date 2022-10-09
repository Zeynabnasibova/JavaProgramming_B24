package ReplitTask.String;
import java.util.Scanner;
public class Print_Half_Twice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
Write a program that will print out first half of the word twice.
 */
        String word = input.nextLine();

        System.out.println(word.substring(0,word.length()/2) + word.substring(0,word.length()/2) );
    }
}
