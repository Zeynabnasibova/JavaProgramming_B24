package codingbat.String1;
import java.util.Scanner;
public class twoChar {

    public static void main(String[] args) {

        /*

Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.


twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();
        System.out.println("Enter your index");
        int  index = input.nextInt();
/*
twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
 */


    if(index==1) {
        System.out.println(str.substring(1, 3));
    }else if(index == 2){
        System.out.println(str.substring(str.length()-2));

    }else if(index < 2){
            System.out.println(str.substring(0,2));
        }else if(index > 2 ){
            System.out.println(str.substring(0,2));

        }else{
            System.out.println(str.substring(index, index +2));
        }
    }
}
