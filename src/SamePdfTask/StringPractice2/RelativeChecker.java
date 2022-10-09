package SamePdfTask.StringPractice2;
import java.util.Locale;
import java.util.Scanner;
public class RelativeChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        Relative checker]
        Given two full names check if the two people are related. They will be considered to be related if they have the same last name
        Ex:
        Input:
        James Bond
        Jamie Bond
        Output: Related
        Input:
        James Bond
        Alex Benji
        Output:
         Not Related
         */

        System.out.println("Enter first full name");
        String firstFullName = input.nextLine().toLowerCase().trim();

        System.out.println("Enter second full name");
        String secondFullName = input.nextLine().toLowerCase().trim();

        String lastName1 = firstFullName.substring(firstFullName.indexOf(" "));
        String lastName2 = secondFullName.substring(secondFullName.indexOf(" "));

        System.out.println(lastName1);
        System.out.println(lastName2);

        if(lastName1.equals(lastName2)){
            System.out.println("Related");
        }else{
            System.out.println("not related");
        }
    }
}
