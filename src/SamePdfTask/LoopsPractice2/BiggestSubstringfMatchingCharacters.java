package SamePdfTask.LoopsPractice2;

public class BiggestSubstringfMatchingCharacters {

    public static void main(String[] args) {

        /*
        Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee
Output: ccccc
         */

        String str = "aaabbbcccccddddee";
        String shorts = " ";
        String longs = " ";
        for(int i = 0; i<str.length()-1;i++){
            shorts = shorts + str.charAt(i);
            if(str.charAt(i) != str.charAt(i+1)){

                shorts = " " ;

            }if(shorts.length() > longs.length()){
                longs = shorts;
            }

        }


        System.out.println(longs);

    }
}
