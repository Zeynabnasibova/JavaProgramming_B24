package ReplitTask.String;
import java.util.Scanner;
public class String_No_End {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Given a Replit Task.String txt print the value without the last letter
         */
        String txt = input.nextLine();

        System.out.println(txt.substring(0,txt.length()-1));
    }
}
