package SamePdfTask.LoopsPractice1;
import java.util.Locale;
import java.util.Scanner;
public class DynamicAlphabet {

    public static void main(String[] args) {

        /*
        [Dynamic alphabet]
• Write a program that will ask ‘upper’ or ‘lower’
• If it is upper: print the alphabet in all uppercase letter from A to Z • If it is lower: print the alphabet in all uppercase letter from a to z
- Challenge: Also ask if they want to show the alphabet in ascending or order descending
- Ascending:A–Z or a–z
- Descending:Z–A or z–a
         */
        Scanner input = new Scanner(System.in);

        System.out.println("You want uper or lower letter ?");
        String letter = input.nextLine();
        System.out.println("ascending order or descending order?");
        String order = input.nextLine();
        if (letter.equalsIgnoreCase("uper")) {

            if (order.equalsIgnoreCase("ascending")) {
                for (char ch = 'A'; ch <= 'Z'; ch++) {
                    System.out.println(ch);
                }
            } else if (order.equalsIgnoreCase("descending")) {
                for (char ch1 = 'Z'; ch1 >= 'A'; ch1--) {
                    System.out.println(ch1);
                }

            }

        } else if (letter.equalsIgnoreCase("lower")) {
            if (order.equalsIgnoreCase("ascending")) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    System.out.println(ch);
                }
            } else if (order.equalsIgnoreCase("descending")) {
                for (char ch1 = 'z'; ch1 >= 'a'; ch1--) {
                    System.out.println(ch1);
                }
            }
        }
    }
}

