package SamePdfTask.Operators_Practice;

public class KgTopounds {
    public static void main(String[] args) {
        /*
        create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
        Ex:kg = 10;
        output:10 kg equal to 22.0462 pounds
        kg = 20
        output:
        20 kg equal to 44.0924 pounds
        ....
        Hint: 1kg = 2.20462 pounds
         */
        int kgFirs = 10,
                kgSecond = 20;
        double newKgFirst = 10 * 2.20462,
                newKgSecond = 20 * 2.20462;
        /*
        1 kg  ----  2.20462 ponds
                                          x = (2.20462 * 10) / 1
        10 kg ----- x ponds
                                         x = 22.0462
         */
        System.out.println(kgFirs+" kg equal to " + newKgFirst+" pounds\n" +
                kgSecond + " kg equal to " + newKgSecond+" pounds");
    }
}
