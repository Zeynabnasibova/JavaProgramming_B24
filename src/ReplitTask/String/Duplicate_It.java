package ReplitTask.String;
import java.util.Scanner;
public class Duplicate_It {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*

        You have 2 words

Print the first word, second word, second word, first word
         */
        System.out.println("Enter first word");
        String word1 = input.nextLine();
        System.out.println("Enter second word");
        String word2 = input.nextLine();
        //System.out.println(word1+word2+word2+word1);

        System.out.println(word1.concat(word2).concat(word2).concat(word1));


        }

    }