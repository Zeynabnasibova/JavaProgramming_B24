package codingbat.String1;
import java.util.Scanner;
public class endsLy {

    public static void main(String [] args){
        /*

Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
         */
Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();
       // String str = "appl";
        if(str.endsWith("ly")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
