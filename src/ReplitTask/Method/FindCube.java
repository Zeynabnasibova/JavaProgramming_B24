package ReplitTask.Method;
import java.util.Scanner;
public class FindCube {
/*
Create a method called cube. It is a void method with no arguments. Write all required code inside this method in order to read a number from the console and then prints the cubed value of that number:

Example:

input: 5

output: 125

hint: cube of a number n = n^3 ->

n * n * n
 */
    public static void main(String[] args) {
          cube();

    }
public static void cube(){
Scanner input = new Scanner(System.in);
int  num = input.nextInt();
        int cube = num * num * num;
        System.out.println(cube);
}

}
