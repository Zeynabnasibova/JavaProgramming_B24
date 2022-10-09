package SamePdfTask.ProblemSet1;
import java.util.Scanner;
public class SwitchHouseOccupants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        [House Occupants]
        Given a house type (ReplitTask.String)print out the number of max occupants (int)
        Tree house: 1
        Mobile home: 2
        Apartment: 4
        Town house: 6
        Villa: 8
        Mansion: 10
        -> Try to use variables instead of printing multiple times
         */

        System.out.println("Input house type");
        String houseType = input.nextLine();

        int numOfMaxOccup = 0;

        switch (houseType) {
            case "Tree house":
                numOfMaxOccup = 1;
                break;
            case "Mobile home":
                numOfMaxOccup = 2;
                break;
            case "Apartment":
                numOfMaxOccup = 4;
                break;
            case "Town house":
                numOfMaxOccup = 6;
                break;
            case " Villa ":
                numOfMaxOccup = 8;
                break;
            case "Mansion":
                numOfMaxOccup = 10;
                break;
        }

                if (numOfMaxOccup > 0) {
                    System.out.println("Max Occupants for a "  + houseType + "is" + numOfMaxOccup + "occupants");
                } else {
                    System.out.println("Invalid house type");

                }
        }
}
