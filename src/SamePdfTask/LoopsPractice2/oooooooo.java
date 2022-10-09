package SamePdfTask.LoopsPractice2;
import java.util.Scanner;
public class oooooooo {

    public static void main(String[] args) {

        /*
Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee Output: ccccc
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = input.nextLine().trim();

        String biggest = " ";
        String shortest = " ";
        for(int i = 0; i < word.length();i++){
            shortest = shortest + word.charAt(i);
            if(word.charAt(i) != word.charAt(i+1)){
                shortest = " ";
            }if(shortest.length() > biggest.length()){
                biggest = shortest;
            }

        }
        System.out.println(shortest);
    }
            }




