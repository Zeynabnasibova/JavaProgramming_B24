package SamePdfTask.Operators_Practice;

public class Increment_Decrement_Operators {
    public static void main(String[] args) {
        int n = 20;//20
        int t = n;//20
        System.out.println("t1: " + t);

        int j = --n;//19
        // int j =-> 19
        System.out.println("j: " + j);//19
        System.out.println("n: " + n);//19

        System.out.println("n: " + --n); // n = 18

        int u = n--;//n = 17 and  return old value 18 for u

        System.out.println("u: " + u);//18
        System.out.println("n: " + n);//17

        System.out.println();

        int i = 5;
        i++; // i = 6
        int x = i++; //i = 7//return old value 6(Output for x = 6)
        System.out.println("x: " + x);//6
        System.out.println("i: " + i);//7

        int b = 10;//return new value 11
        int c = ++b; // b = 11 and return new value for c = 11

        System.out.println("b: " + b);//11
        System.out.println("c: " + c);//11
    }
}
