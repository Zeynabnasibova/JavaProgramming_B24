package day20_String;
import java.util.Scanner;
public class badWord {
   /*
    [Bad Word]
        Given a ReplitTask.String variable with a message. You will check if the message contains any of these bad words: “idiot, dumb, heck”
        If the message contains any of those words print: “Message not sent”. If the message is bad word free print “Message sent”
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message");
        String msg = input.nextLine().toLowerCase();

        boolean hasBadWord = msg.contains("idiot") || msg.replace(" ",  "").contains("dumb") || msg.contains("heck");

        if(hasBadWord){
            System.out.println("Message not sent");
        } else {
            System.out.println("Message sent");
        }



    }
}