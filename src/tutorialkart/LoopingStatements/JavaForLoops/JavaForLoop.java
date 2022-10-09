package tutorialkart.LoopingStatements.JavaForLoops;

public class JavaForLoop {

    public static void main(String[] args) {

        /*
        Java For Loop
Java For Loop can be used to execute a set of statements in a definite or indefinite loop based on a condition.
Java For loop functionality is same as that of Java While loop, except that the initialization and update can be defined in for loop definition iteself.
In this tutorial, we will learn how to define/write a Java For loop, and its usage using example programs.
Syntax of Java For Loop
The syntax of Java For loop is given below.

        for(initialization; condition; update) {
            //statements

            where
initialization can contain one or more variables defined and initialized.
condition is the expression which is checked during each iteration of the loop.
update can contain increment, decrement, or any update to the variables. Variables defined in the initialization part can be updated here.
Example 1 – Java For Loop
Following is a simple example to implement Java For loop. In the initialization, we have defined a variable i and assigned a value 0 to it. During each iteration we check if i is less than 5 and increment i at the end of each iteration
         */

        for(int i=0;i<5;i++) {
            System.out.println(i);
        }

        }


    }
