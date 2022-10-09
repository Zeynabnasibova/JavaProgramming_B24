package Javatpoint.JavaStringFAQsorInterviewQuestions;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Q4ReverseUseArrays {
    public static void main(String[] args) {

        String name = "this is javatpoint";

        char [] sentence = name.toCharArray();
        System.out.println(Arrays.toString(sentence));

        char ch [] = name.toCharArray();
        System.out.println(Arrays.toString(ch));

        String [] arraySentence = name.split(" ");
        System.out.println(Arrays.toString(arraySentence));

        String arraySentence1 [] = name.split(" ");
        System.out.println(Arrays.toString(arraySentence1));

        String reverse = "";

        for(int i = ch.length-1;i>=0;i--){

            reverse += ch[i];
        }
        System.out.println(reverse);
    }
}
