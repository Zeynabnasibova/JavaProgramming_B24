package ReplitTask.String;
import java.util.Scanner;
public class Middle_Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Given a ReplitTask.String variable word print the middle three characters if the word is an odd number of characters and has more than 5 characters. If the word does not meet the requirements print invalid.

         */
        String word = input.nextLine();
        if(word.length()%2 != 0 && word.length() > 5){
            System.out.println(word.substring((word.length()/2-1),(word.length()/2+2)));
        }else{
            System.out.println("Invalid");
        }
        //  0 1 2  3  4 5 6
        //  o r a  n  g e s
    }
}
