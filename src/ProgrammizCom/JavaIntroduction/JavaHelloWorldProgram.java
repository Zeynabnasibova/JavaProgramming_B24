package ProgrammizCom.JavaIntroduction;

// Your First Program

public class JavaHelloWorldProgram { //JavaHelloWorldProgram  is the name of the classand the class definition is:
    /*class JavaHelloWorldProgram {
    ................
    }
    every Java application has a class definition, and the name of the class should match the filename in Java.
     */

    public static void main(String[] args) { /*This is the main method. Every application in Java must contain the main method. The Java compiler starts executing the code from the main method.

    */

            System.out.println("Hello, World!"); /*
            The code above is a print statement. It prints the text Hello, World! to standard output (your screen). The text inside the quotation marks is called String in Java.
            Notice the print statement is inside the main function, which is inside the class definition.


             */
        }
    }
    /*
    Things to take away

Every valid Java Application must have a class definition (that matches the filename).
The main method must be inside the class definition.
The compiler executes the codes starting from the main function.

This is a valid Java program that does nothing.

public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here
    }
}
     */