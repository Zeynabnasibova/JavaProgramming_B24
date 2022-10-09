package day18_String;

public class RecapMethods {

    public static void main(String[] args) {

        String day = "thursDAY";

        boolean b = day.equals("Thursday");
        System.out.println(b);

        System.out.println(day.equalsIgnoreCase("Thursday"));

        day = day.toUpperCase();

        System.out.println(day);
        System.out.println(day.toLowerCase());
        System.out.println(day);

        System.out.println(day.length() + 1);  // 8 (int) + 1 (int) -> 9
        System.out.println(day); // THURSDAY

        // day = day.length(); length method returns int and we are trying to store to ReplitTask.String
        day = day.length() + ""; // types: int + ReplitTask.String -> concatenation -> ReplitTask.String type back // values of "8"
        System.out.println(day + 2); // ReplitTask.String + int -> concatenation -> "8" + 2 -> "82"

        System.out.println("5 + 2 = " + 5 + 2);
        //  "5 + 2 = " + 5 -> "5 + 2 = 5" // ReplitTask.String + int
        //  "5 + 2 = 5"  + 2 -> 5 + 2 = 52
        System.out.println("5 + 2 = " + (5 + 2) );

    }
}