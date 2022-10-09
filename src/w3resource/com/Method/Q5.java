package w3resource.com.Method;

public class Q5 {
    public static void main(String[] args) {

        String str = "I love mom";

countAllWords(str);

    }

    /*
    Write a Java method to count all words in a string. Go to the editor
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9
     */

    public static int countAllWords(String str){


     // str = "The quick brown fox jumps over the lazy dog.";

      String [] allWords = str.split(" ");

        System.out.println(allWords.length);

        return allWords.length;
    }


}
