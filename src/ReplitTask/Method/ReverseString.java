package ReplitTask.Method;
import java.util.Scanner;
public class ReverseString {

/*
The reverse method will reverse the given String

Example:

reverse("foo") ==> "oof"

reverse("student") ==> "tneduts"
 */
public static String reverse(String input){


String reverse = "";

for(int i = input.length()-1; i >= 0; i-- ){

    reverse += input.charAt(i);


}

    return  reverse;

}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}
