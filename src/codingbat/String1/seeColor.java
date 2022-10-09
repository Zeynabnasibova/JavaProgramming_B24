package codingbat.String1;
import java.util.Scanner;
public class seeColor {

    public static void main(String [] args){

        /*
        Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
         */
Scanner input = new Scanner(System.in);
String str = input.nextLine();
    //    String str = "red";
        if(str.startsWith("red") && str.length() >= 3){
            System.out.println(str.substring(0,3) );
        }else if(str.startsWith("blue") && str.length()>=4){
            System.out.println(str.substring(0,4));
        }else if (str.contains("blue") ) {
            System.out.println(str.substring(str.length()-4,str.length()));
        }else if ( str.contains("red")){
            System.out.println(str.substring(str.length()-3,str.length()));
        }else{
            System.out.println(" x");
        }

    }
}
