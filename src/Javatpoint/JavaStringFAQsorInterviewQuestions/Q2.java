package Javatpoint.JavaStringFAQsorInterviewQuestions;

public class Q2 {

    public static void main(String[] args) {

        /*
        2) What is the difference between equals() method and == operator?

The equals() method matches content of the strings whereas == operator matches object or reference of the strings.
         */



        String s1="Sachin";
        String s2="Sachin";
        String s3 = new String("Sachin");
        String s4="Saurav";

        System.out.println(s1.equals(s2));//true  //
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false





        System.out.println(s1 == s2);//true (because both refer to same instance)
        System.out.println(s1 == s3);//false(because s3 refers to i
    }
}
