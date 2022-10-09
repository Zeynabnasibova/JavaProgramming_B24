package ProgrammizCom.LoopTask;

public class DisplayNumbersFrom1To5DoWhileLoop {

    public static void main(String[] args) {

        int i = 1, n = 5;

        // do...while loop from 1 to 5
        do {
            System.out.println(i);
            i++;
        } while(i <= n);


        /*
        Output

1
2
3
4
5
Here is how this program works.

Iteration	Variable	Condition: i <= n	Action
 	i = 1
n = 5	not checked	1 is printed.
i is increased to 2.
1st	i = 2
n = 5	true	2 is printed.
i is increased to 3.
2nd	i = 3
n = 5	true	3 is printed.
i is increased to 4.
3rd	i = 4
n = 5	true	4 is printed.
i is increased to 5.
4th	i = 5
n = 5	true	6 is printed.
i is increased to 6.
5th	i = 6
n = 5	false	The loop is terminated

         */
    }
}
