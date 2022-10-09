package SamePdfTask.ProblemSet1;

public class Operators2 {
    public static void main(String[] args) {

    /*
    Analyze each step,
    What is the result numOne,
    numTwo,
     and biggest?
     int numOne = 10;
     int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
     int biggest = numOne > numTwo ? numOne : numTwo;
     */
        int numOne = 10;//11, 12,13
        //
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        //           10*3 + 12 + 12%2
        //           30+12 + 0
        //           42
        int biggest = numOne > numTwo ? numOne : numTwo;
        //            13 > 42 ? 13 : 42
        //42
        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(biggest);

    }
}
