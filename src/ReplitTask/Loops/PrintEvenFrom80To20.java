package ReplitTask.Loops;

public class PrintEvenFrom80To20 {

    public static void main(String[] args) {
        /*
        Write a for loop that prints all even integers from 80 through and including 20. Seperate each number with a space

         */
        int numbers = 0;
        String evenNumber = "";
        for(int i = 80; i >= 20; i--){
            if(i%2==0){
                numbers--;
                evenNumber += i + " ";
            }
        }

        System.out.println(evenNumber.trim());
    }
}
