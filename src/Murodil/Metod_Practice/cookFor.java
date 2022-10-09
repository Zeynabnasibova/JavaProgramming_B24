package Murodil.Metod_Practice;

public class cookFor {

    /*
    method cookFor accepts minutes and way of cooking and prints
    "You need to cook for minutes by wayOfCooking"
     */
public static void cookFor(int minutes,String wayOfCooking){

    System.out.println("You need to cook for " + minutes + " minutes by " + wayOfCooking);
}

    public static void main(String[] args) {
        cookFor(30,"meat");
    }
}
