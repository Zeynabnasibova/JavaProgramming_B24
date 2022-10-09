package tutorialkart.LoopingStatements.JavaLoops;

public class javaContinue {

    public static void main(String[] args) {

        /*

        Java Continue
Java continue statement is used to skip the execution of subsequent statement in the loop block, and continue with the next iteration.
If continue statement is used in nested loops, only the immediate loop is considered.
Continue statement can be used inside a For loop, While loop and Do-while loop statements.
Syntax
The syntax of continue statement is

         */
        /*
        Continue For Loop
In the following example, we write a For loop with condition to execute until i is less than 10. But, inside the For loop, we execute continue statement when i equals 5.
         */
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        int[] arr = {1, 2, 4, 8, 16};

        for (int x : arr) {
            if (x == 8) {
                continue;
            }
            System.out.println(x);
        }

/*
Continue While Loop
In the following example, we write a While loop with condition to execute until i is less than 10. But, inside the While loop, we continue with next iteration when i equals 5.
 */

        System.out.println();
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
/*
Continue Do-while Loop
In the following example, we use continue statement inside a do-while loop.
 */
        }

        System.out.println();
        int i1 = 0;
        do {
            if(i1 == 5) {
                i1++;
                continue;
            }
            System.out.println(i1);
            i1++;
        } while(i1 < 10);

    }
}
