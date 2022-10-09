package w3resource.com.String;

public class _13SameDate {

    public static void main(String[] args) {

        /*

        Write a Java program to check whether two ReplitTask.String objects contain the same data.
         */

        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";

        // Are any of the above Strings equal to one another?
        boolean equals1 = columnist1.equals(columnist2);
        boolean equals2 = columnist1.equals(columnist3);

        // Display the results of the equality checks.
        System.out.println("\"" + columnist1 + "\" equals \"" +
                columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" +
                columnist3 + "\"? " + equals2);


//        System.out.println(columnist1.contains(columnist2));
//        System.out.println(columnist1.contains(columnist3));
//        System.out.println(columnist2.contains(columnist3));



        String name1 = "solo 1";
        String name2 = "solo";
        System.out.println(name1.contains(name2));
        System.out.println(name2.contains(name1));

    }
}
