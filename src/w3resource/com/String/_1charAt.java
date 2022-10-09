package w3resource.com.String;

public class _1charAt {
    public static void main(String[] args) {


        /*
        1. Write a Java program to get the character at the given index within the ReplitTask.String.

        Sample Output:

Original ReplitTask.String = Java Exercises!
The character at position 0 is J
The character at position 10 is i

      " J a v a     E x e r c i  s  e  s  !"
                    |
                    |
       Get the character at the given index
                    |
                    |
         0 1 2 3 4  5 6 7 8 9 10 11 12 13 14
       " J                     i

                     |
                     |

              The character at position 0 is J
              The character at position 10 is i


         */
        //                 0123456789 10 11 12 13 14
        String sentence = "Java Exercises!";
        System.out.println("Original ReplitTask.String = " + sentence);
        //Get the character at position 0 and 10
        int index1 = sentence.charAt(0);
        int index2 = sentence.charAt(10);

        //Print out the results.
        System.out.println("The character at position 0 is " + (char)index1);
        System.out.println("The character at position 10 is " + (char)index2);
        System.out.println();

        int index3 = sentence.charAt(1);
        char index4 = sentence.charAt(1);

        System.out.println(index3);
        System.out.println(sentence.charAt(1));

        System.out.println();

        System.out.println(index4);
        System.out.println(sentence.charAt(1));

        System.out.println();

        char letter = 'l';
        char letter1 = '0';
        char letter2 = '9';
        char letter3 = 'A';
        char letter4 = 30;
        char letter5 = 9;
        char letter6 = 24;
        char letter7 = 11;
        char letter8 ='b';



        System.out.println(letter);
        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println();
        System.out.println("30" + letter4+"30");
        System.out.println("9" +letter5+"9");
        System.out.println("100" + letter6+"100");
        System.out.println("11"+letter7+"11");
        System.out.println("b"+letter8+"b");





    }
}
