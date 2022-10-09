package ReplitTask.String;
import java.util.Scanner;
public class word {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

String word1 = input.nextLine();
String word2 = input.nextLine();

if(word1.equals(word2)){
    System.out.println("word1 equals word2");
}else{
    System.out.println("word1 does not equal word2");
}

    }
}

