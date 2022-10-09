package ReplitTask.Method;
import java.util.Scanner;
public class PalindromeNumber {

    /*
Complete the method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false).

Challenge: Do not convert int into a string!
Examples:

input: 1001

output: true

input: 1234

output: false

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

int reverse = 0;

for(;num != 0;){

    int remainder = num % 10;

    reverse += reverse * 10;

    num = num / 10 ;


}
if(num == reverse){

    System.out.println(true);

}else{
    System.out.println(false);
}

    }
}
