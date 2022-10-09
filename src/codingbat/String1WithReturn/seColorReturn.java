package codingbat.String1WithReturn;

public class seColorReturn {
/*

Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */
    public static String seeColor(String str) {

        if(str.startsWith("red") && str.length() >= 3){

            str = str.substring(0,3);

            System.out.println(str);

            return str;

        }else if(str.startsWith("blue") && str.length() >= 4){

            str = str.substring(0,4);

            System.out.println(str);

            return str;

        }else{
            System.out.println("");
            return "";
        }

    }

    public static void main(String[] args) {
        seeColor("redxx");
    }

}
