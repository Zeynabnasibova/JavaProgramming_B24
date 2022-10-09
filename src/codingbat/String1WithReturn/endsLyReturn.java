package codingbat.String1WithReturn;
import java.util.Scanner;
public class endsLyReturn {

    public static boolean ends(String str){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        str = input.nextLine();

     if(str.endsWith("ly") ){

            System.out.println("true");

            return true;
        } else {

         System.out.println("false");

         return false;

        }

    }

    public static void main(String[] args) {

        ends("oddy");

    }
}
