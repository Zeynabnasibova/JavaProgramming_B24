package codingbat.String1;
import java.util.Scanner;
public class saltTwo {
    public static void main(String[] args) {
        /*

Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
abcd
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();

//        String word = "ab";//ba
//        System.out.println(word.substring(word.length()-1,word.length()) +word.substring(0,1));

        if(str.length()>=2){
            System.out.println(str.substring(0,str.length()-2) + str.substring(str.length()-1,str.length()) + str.substring(str.length()-2,str.length()-1));
        }else{
            System.out.println(str);
        }
    }
}
