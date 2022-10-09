package codingbat.String1;
import java.util.Scanner;
public class helloName {

    /*
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();

        //String name = "Bob";

      name = "Hello ".concat(name) + "!";
        System.out.println(name);


    }
}
