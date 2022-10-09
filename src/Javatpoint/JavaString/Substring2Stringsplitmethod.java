package Javatpoint.JavaString;
import java.util.Arrays;
public class Substring2Stringsplitmethod {

    public static void main(String[] args) {
        /* Driver Code */
            String text= new String("Hello, My name is Sachin");
            /* Splits the sentence by the delimeter passed as an argument */
            String[] sentences = text.split("\\.");
            System.out.println(Arrays.toString(sentences));

        }
}
