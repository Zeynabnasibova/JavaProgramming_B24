package day13_if_statments;
import java.util.Scanner;
public class YesOrNo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name");
        String firstName = input.next();

        System.out.println(firstName + " do you like soccer");
        String likeSoccer = input.next();

        if(likeSoccer.equals("yes") || likeSoccer.equals("Yes") || likeSoccer.equals("YES")){

            System.out.println("who is your favorite team");
            String team = input.next();

            System.out.println("Oh I like " + team  + " too");

        } else if(likeSoccer.equals("no")){
            System.out.println("Thats okay");
        } else {
            System.out.println(firstName + " you didn't answer the question");
        }



    }

}
