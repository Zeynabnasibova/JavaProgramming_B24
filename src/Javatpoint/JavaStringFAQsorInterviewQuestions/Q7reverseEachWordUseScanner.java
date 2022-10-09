package Javatpoint.JavaStringFAQsorInterviewQuestions;
import java.util.Scanner;
public class Q7reverseEachWordUseScanner {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String sentence = input.nextLine();

        String reverse = "";
        for(int i = sentence.length() - 1; i >= 0; i--){

            reverse += sentence.charAt(i);
        }
        System.out.println(reverse);
    }
}
