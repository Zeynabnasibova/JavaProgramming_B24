package tutorialkart.LoopingStatements.JavaLoops;

public class JavaBreak {
    public static void main(String[] args) {


        /*
        Java break statement is used to break a surrounding loop or switch statement, irrespective of the result of loop condition.
If break statement is used in nested loops, only the immediate loop is broke.
Break statement can be used inside a For loop, While loop, Do-while loop, and Switch statements.

Syntax
The syntax of break statement is
bre
         */
/*
Break For Loop
In the following example, we write a For loop with condition to execute until i is less than 10. But, inside the For loop, we are conditionally breaking out of the loop when i equals 5.
 */


        for(int i=0; i<10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i);
        }


/*
Break Do-while Loop
In the following example, we write a For loop with condition to execute until i is less than 10. But, inside the For loop, we are conditionally breaking out of the loop when i equals 5.
 */
        /*
        Break Switch Statement
In the following example, we write a For loop with condition to execute until i is less than 10. But, inside the For loop, we are conditionally breaking out of the loop when i equals 5.
         */

    }
}
