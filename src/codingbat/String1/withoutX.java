package codingbat.String1;
import java.util.Scanner;
public class withoutX {
    public static void main(String[] args) {

        /*

Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
         */
Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
String str = input.nextLine();

        if(str.length()<=2 && str.contains("x")){
            System.out.println("");
        } else if(str.length()<=2 || !str.startsWith("x") && !str.endsWith("x")){
}else if (str.startsWith("x") && str.endsWith("x")){
    System.out.println(str.substring(1,str.length()-1) );
}else if(str.startsWith("x")) {
    System.out.println(str.substring(1));
}else if(str.endsWith("x")){
    System.out.println(str.substring(0,str.length()-1));

        }else{
    System.out.println(str);
        }

// if(str.length()<=2 && str.contains("x")){
//   return "";
    }
}
