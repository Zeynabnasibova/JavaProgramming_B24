package codingbat.String1;
import java.util.Scanner;
public class makeTags {

    public static void main(String[] args) {
        /*
        The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".


makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your tag");
        String tag = input.nextLine();
        System.out.println("Enter your word");
        String word = input.nextLine();

        String newWord = "<" + tag + ">" + word + "</" + tag + ">";
        System.out.println(newWord);
    }
}
