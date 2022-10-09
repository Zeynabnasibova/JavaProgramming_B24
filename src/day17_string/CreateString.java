package day17_string;

public class CreateString {

    public static void main(String[] args) {
        String first = "java"; // ReplitTask.String literal
        // create a ReplitTask.String object in the ReplitTask.String pool

        String second = new String("java"); // ReplitTask.String using new
        // creates a ReplitTask.String object in the heap, NOT the ReplitTask.String pool

        System.out.println(first == second); // == with ReplitTask.String does not check the value
        // It checks the memory location and compares them

        System.out.println(first.equals(second)); // .equals compares the values, not memory location

        String third = "java";

        System.out.println(first == third);

        String fourth = third;

        /*
           =======================================
                        HEAP
            -------------------------------------------------
                        STRING POOL
            first        ->      "java"         <-  third
                                    ^
                                    fourth
            five       ->    "Java"
            -------------------------------------------------
            second        ->     [    "java"    ]
            =======================================
         */

        String five = "Java";
        five = five + " is fun";

        String six = "Java is fun";

        System.out.println(five == six);

    }
}