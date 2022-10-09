package Interwiequestion;

public class Q1 {
    public static void main(String[] args) {

        String s1 = "Hello";//pool
        String s2 = "hi";//heap

        System.out.println((s1 == s2) + " " + (s1.equals(s2)));
    }//false true
}
// true true