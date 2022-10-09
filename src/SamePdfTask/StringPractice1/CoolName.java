package SamePdfTask.StringPractice1;
import java.util.Scanner;
public class CoolName {
    public static void main(String[] args) {
        /*
        [Cool Name]
        Declare a variable name. You will check if it is a cool name.
        -If the name begins with an ‘a’ or a ‘z’ print “Your name is cool”-
        If the name ends with 'm' print "Almost cool"-
        Otherwise print “Sorry not a cool name”
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Input your name");
        String name = input.nextLine().toLowerCase();

        if(name.startsWith("a") || name.startsWith("z")){
            System.out.println("Your name is cool");
        }else if(name.endsWith("m")){
            System.out.println("Almost cool");
        }else{
            System.out.println("Sorry not a cool name");
        }




    }
}
