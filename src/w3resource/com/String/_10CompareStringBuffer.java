package w3resource.com.String;

public class _10CompareStringBuffer {

    public static void main(String[] args) {

        /*
        Write a Java program to compare a given string to the specified string buffer.
         */

        String str1 = "example.com", str2 = "Example.com";
        StringBuffer strbuf = new StringBuffer(str1);

        System.out.println("Comparing "+str1+" and "+strbuf+": " + str1.contentEquals(strbuf));

        System.out.println("Comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));

        System.out.println(str1.contains(strbuf));
        System.out.println(str2.contains(strbuf));

    }
}
