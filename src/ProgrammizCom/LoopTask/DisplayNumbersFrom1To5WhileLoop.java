package ProgrammizCom.LoopTask;

public class DisplayNumbersFrom1To5WhileLoop {

    public static void main(String[] args) {
        // declare variables
        int i = 1, n = 5;

        // while loop from 1 to 5
        while(i <= n) {
            System.out.println(i);
            i++;
        }
        /*
        Output

1
2
3
4
5
Here is how this program works.

Iteration	Variable	Condition: i <= n	Action
1st	i = 1
n = 5	true	1 is printed.
i is increased to 2.
2nd	i = 2
n = 5	true	2 is printed.
i is increased to 3.
3rd	i = 3
n = 5	true	3 is printed.
i is increased to 4.
4th	i = 4
n = 5	true	4 is printed.
i is increased to 5.
5th	i = 5
n = 5	true	5 is printed.
i is increased to 6.
6th	i = 6
n = 5	false	The loop is terminated

         */
    }
}
