package SamePdfTask.ProblemSet1;

public class Operators1 {
    public static void main(String[] args) {

        /* Analyze each step,
         What is the result of a, b, and c?
         int a = 3,
         b = 2;
         long c = (a--+ b) * 2 / 3 % 2;
         */
        int a = 3;//2
        int b = 2;
        long c = (a-- + b) * 2 / 3 % 2;
             //   (3 + 2)* 2/3%2
        //         5*2/3%2
        //         10/3%2
        //          3%2
        //           1

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
