package ReplitTask.String;
import java.util.Scanner;
public class HasAJava {

    public static void main(String[] args) {

        /*

        Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0.

Example:

input: javapython

output: true

input: cjavac++

output: true

input: c#javaruby

output: false
         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
//   javaxxxxx
        // xjavaxx
        // - xxjava

        if(word.length()>=4){
            if(word.startsWith("java")){
                System.out.println("true");
            }else if(word.substring(1).startsWith("java")){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("false");

        }




//         if (word.length() >= 5) {
//           if (word.startsWith("java")) {
//             System.out.println("true");
//           } else if (word.substring(1).startsWith("java")) {
//             System.out.println("true");
//           } else {
//             System.out.println("false");
//           }
//         } else {
//          System.out.println("false");
//         }
    }
}
