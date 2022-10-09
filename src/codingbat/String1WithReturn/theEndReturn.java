package codingbat.String1WithReturn;

import java.util.Scanner;

public class theEndReturn {

/*
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"

 */
    public  static String theEnd(String str, boolean front) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your  word");
        str = input.nextLine();
        System.out.println("Enter true or false");
        front = input.nextBoolean();

            if(front){
                str = str.substring(0,1);

                System.out.println(str);
                return str.substring(0,1);

            }else{

                str = str.substring(str.length()-1);

                System.out.println(str);

                return str.substring(str.length()-1);
            }

        }

    public   static void main(String[] args) {

        //System.out.println(theEnd("Helllo",true));

        theEnd("Hello",true);

    }

    }
