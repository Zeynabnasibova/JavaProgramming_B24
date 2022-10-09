package day20_String;

public class SubstringPractice {
    public static void main(String[] args) {

        String word = "abcdefghi";
//                     012345678
        System.out.println(word.substring(4));// efghi
        System.out.println(word.substring(6));// ghi
        System.out.println(word.substring(4,6)); //ef
        System.out.println(word.substring(4,7)); //efg
       // System.out.println(word.substring(4,3));//error
        System.out.println(word.substring(0,8));//abcdefgh
        System.out.println(word.substring(0,9));//abcdifghi
        //System.out.println(word.substring(0,10));//error
        System.out.println(word.substring(4,4));//nothing
        System.out.println(word.substring(4,5));//e

    }
}
