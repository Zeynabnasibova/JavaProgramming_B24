package SamePdfTask.StringPractice1;
import java.util.Scanner;
public class BadWord {

    public static void main(String[] args) {

        /*

        [Bad Word]
        Given a String variable with a message. You will check if the message contains any of these bad words: “idiot, dumb, heck”
        If the message contains any of those words print: “Message not sent”.
        If the message is bad word free print “Message sent”
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Input your message");

        String message = input.nextLine().toLowerCase();

        if(message.contains("idiot") ||message.contains("dumb") || message.contains("heck") ){

            System.out.println("Message not sent");
        }else{
            System.out.println("Message sent");
        }




    }
}
