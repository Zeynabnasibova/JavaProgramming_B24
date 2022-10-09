package ReplitTask.Method;
import java.util.Scanner;
public class RemoveFirstChar {


    /*
    he method accepts a string and returns a string without the first character

Example:

removeFirst("aaa")

returns "aa"
     */

    public static String removeFirst(String target) {

String newTarget = target.substring(1);
return newTarget;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(removeFirst(in.next()));
    }

}
