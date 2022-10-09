package ReplitTask.String;
import java.util.Scanner;
public class Alejandro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Alejandro has many emails and only has time to read the emails that refer to him. Check if his name is found in the email and if it does print "read", but if his name is not in the email print "don't read"
         */
        System.out.println("Enter @mail");
        String email = input.nextLine();
        String name = "Alejandro";

        if(email.contains(name)){
            System.out.println("read");
        }else{
            System.out.println("dont't read");
        }
    }
}
