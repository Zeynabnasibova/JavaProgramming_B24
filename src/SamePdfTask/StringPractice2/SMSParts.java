package SamePdfTask.StringPractice2;
import java.util.Scanner;
public class SMSParts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        [SMS parts]
        Given a String in the following format:
        “Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
         Separate these parts and print them separately:
         Sender: actualSender
         Number: actualNumber
         Message: actualMessage”
         */

//        System.out.println("Enter sender");
//        String sender = input.nextLine();
//
//        System.out.println("Enter number");
//        String number = input.nextLine();
//
//        System.out.println("Enter actual Message");
//        String message = input.nextLine();

        String str = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";

        System.out.println(" " + str.substring(0,str.indexOf(" ")) + str.substring(str.indexOf("<")+1,str.indexOf(">")));
        System.out.println(" " + str.substring(str.indexOf("N"),str.indexOf("["))+ str.substring(str.indexOf("[")+1, str.indexOf("]")));

        System.out.println(" " + str.substring(str.indexOf("M"),str.indexOf("{")) +str.substring(str.indexOf("{")+2,str.indexOf("}")));


    }
}
