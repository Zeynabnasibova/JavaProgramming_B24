package ReplitTask.String;
import java.util.Scanner;
public class GetSandwich {

    public static void main(String[] args) {

        /*
        A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Example:

input: breadjambread

output: jam

input: xxbreadjambreadyy

output: jam

input: xxbreadapple

output: nothing

input: breadbutterbread

output: butter
         */
        Scanner scan = new Scanner(System.in);
// xxbreadbreadjamready


        String str = scan.nextLine();

        if (str.startsWith("bread") || (str.endsWith("bread"))) {

            System.out.println(str);

        }else{
            System.out.println("nothing");
        }
        System.out.println(str);
       // int bread = "bread".length()+2;
       // int bread2 = "bread".length()+7;
       // System.out.println(str.substring(0,bread));
        //System.out.println(str.substring(2,bread2));
    }
}