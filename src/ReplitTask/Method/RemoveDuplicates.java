package ReplitTask.Method;
import java.util.Scanner;
public class RemoveDuplicates {

/*
uniqueChars is a method that will accept any String and return the String with out any dupclicate characters

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"
 */


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(uniqueChars(in.next()));
        }

        public static String uniqueChars(String str) {
            //TODO: write your code

            String unique = "";

            for(int i = 0; i < str.length(); i++){

                if(!unique.contains("" + str.charAt(i)))

                        unique += str.charAt(i);
                    }
                    return unique;
                }

            }

