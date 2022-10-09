package SamePdfTask.StringPractice2;
import java.util.Locale;
import java.util.Scanner;
public class relativcheker {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Enter your first full name");
        String fullname1 = input.nextLine().toLowerCase();
        System.out.println("Enter your second full name");
        String fullname2 = input.nextLine().toLowerCase();

        String lastName1 = fullname1.substring(fullname1.indexOf(" "));
        String lastName2 = fullname2.substring((fullname2.indexOf(" ")));

        if(lastName1.equals(lastName2)){
            System.out.println("Related");
        }else{
            System.out.println(" Not Related");
        }

//String fullnmae1 = "James Bond";
//String fuulname2 = "Jamie Bond";




    }
}
