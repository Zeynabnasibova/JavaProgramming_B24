package Javatpoint.JavaStringFAQsorInterviewQuestions;

public class Q7ReverseEachWordUseeasyForLoop {

    public static void main(String[] args) {

        String sentence = "this is javatpoint";

        String reverse = "";

        for(int i = sentence.length()-1; i >=0; i--){
            reverse += sentence.charAt(i);
        }
        System.out.println(reverse);

        String firstReversetWord = reverse.substring(reverse.lastIndexOf(" ")+1);

        String secondReversedWord = reverse.substring(reverse.indexOf(" ") + 1,reverse.lastIndexOf(" "));

        String thirdReversedWord = reverse.substring(0,reverse.indexOf(" "));

        System.out.println(firstReversetWord + " " + secondReversedWord + " " + thirdReversedWord);
    }
}
