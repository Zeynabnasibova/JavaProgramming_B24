package ReplitTask.String;
import java.util.Scanner;
public class Print_Last_Char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
Write a program that will print out last letter of the word ( ReplitTask.String )

 */
        System.out.println("Enter a word");
        String word = input.nextLine();

//        int charCount = word.length();
//        int lastCharIndex = charCount - 1;
//        char lastChar = word.charAt(lastCharIndex);
//        System.out.println(lastChar);

        System.out.println(word.charAt(word.length()-1));

        System.out.println(word.substring(word.length() - 1));



    }
}
