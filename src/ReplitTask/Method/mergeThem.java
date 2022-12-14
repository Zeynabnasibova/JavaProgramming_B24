package ReplitTask.Method;
import java.util.Scanner;
public class mergeThem {

    /*
    Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. Please note one and two can be of different lengths.

Examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
     */
    public static String mergeStrings(String one, String two) {

        String merge1 = "";
        if(one.length() > two.length() ){

            for(int i = 0; i < two.length(); i++){

                merge1 += "" + one.charAt(i) + two.charAt(i);

            }

            merge1 += one.substring(two.length());

        }else if (one.length() < two.length() ) {

            for (int i = 0; i < one.length(); i++) {

                merge1 += "" + one.charAt(i) + two.charAt(i);

            }

           merge1 += two.substring(one.length());

        } else{
            for(int i = 0; i < one.length();i++){

                merge1 += "" + one.charAt(i) + two.charAt(i) ;
            }
        }
    return merge1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }


}
