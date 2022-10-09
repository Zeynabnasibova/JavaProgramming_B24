package codingbat.String1WithReturn;

public class lastCharReturn {

    /*
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
     */

    public static String lastChars(String a, String b) {
        //a = "yo";b = "java" --> "ya"

        String newAB = "";
        if (a.length() < 1 && b.length() < 1) {
            newAB = "@@";
            System.out.println(newAB);
            return newAB;
        } else if (a.length() < 1 && b.length() > 0) {
            newAB = "@" + b.substring(b.length() - 1);
            System.out.println(newAB);
            return newAB;
        }else if(a.length() >0 && b.length()<1){

            newAB = a.substring(0, 1) + "@";
            System.out.println(newAB);
            return newAB;
        } else {
            newAB = a.charAt(0) + b.substring(b.length()-1);
            System.out.println(newAB);
            return newAB;
        }

    }

    public static void main(String[] args) {
        lastChars("last","chars");
    }
}
