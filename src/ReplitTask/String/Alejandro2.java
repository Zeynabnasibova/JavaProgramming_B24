package ReplitTask.String;
import java.util.Scanner;
public class Alejandro2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
    Alejandro has many emails and only has time to read the emails that refer to him and a project. Check if his name is found in the email and if project is also included and if it does print "read", but if his name is not in the email print "don't read"
         */

        String email = input.nextLine();
        String name = "Alejandro";

        if(email.contains(name) && email.contains("project")){
            System.out.println("read");
        }else{
            System.out.println("don't read");
        }

    }
}
