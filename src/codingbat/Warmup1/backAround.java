package codingbat.Warmup1;

public class backAround {
    /*
    Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
     */

    public static void main(String[] args) {

backAround("cat");
    }


public static String backAround(String str){

    str = str.substring(str.length()-1) + str.substring(0,str.length()) + str.substring(str.length()-1);

    System.out.println(str);

    return str;

}


}
