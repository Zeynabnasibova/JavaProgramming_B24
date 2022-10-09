package ReplitTask.Loops;
import java.util.Scanner;
public class RepeatSeperator {

    public static void main(String[] args) {

        /*
        Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Example:

input:
Word
X
3

output: WordXWordXWord

Example:

input:
This
And
2

output: ThisAndThis

Example:

input:
This
And
1

output: This
         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        // String biggest = "";
        String counter = "";

        for (int i = 0; i < count; i++) {
//            if(word.length()>separator.length()){
//                biggest = word;
//            }else {
//                biggest = separator;
//                counter += biggest;

            if (i > 1) {
                counter += separator;
            }
                counter += word;
//                }
//
//            }
            }
            //   System.out.println(biggest);
            System.out.println(counter);

        }
    }
