package SamePdfTask.Operators_Practice;

public class GalonsToLiters {

    public static void main(String[] args) {

        /*
        create a class called GalonsToLiters, and write a program that can convert the gallons tto litters
        Ex:galon = 10;
        output:
        10 gallons equal to 37.8541 liters
        galon = 20
        output:
        20 gallons equal to 75.7082 liters
         */
        int galon1 = 10,
                galon2 =20;
        double convertGalon1 = 10 * 3.78541,
                convertGalon2 = 20 * 3.78541;
        System.out.println(galon1 + " gallons equal to "+convertGalon1 + " liters \n" + galon2 + " gallons equal to " + convertGalon2+" liters" );
    }
}
