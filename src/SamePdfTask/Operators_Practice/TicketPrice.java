package SamePdfTask.Operators_Practice;

public class TicketPrice {
     /*
    add new class TicketPrice
add main method
From Chicago to Virginia
	city 1 -> Chicago
	city 2 -> Virginia
	base ticket price -> 110.50
	miles between cities -> 739.8
		add to the ticket price by dividing miles by 10
Example output:
	The ticket price from Chicago to Virginia is $184.48
     */
     public static void main(String[] args) {

         String city1 = "chicaho",
                 city2 = "Virginia";
         double baseTicketPrice = 110.50,
                milesBetweenCities = 739.8,
                 totalPriceAfterMiles = baseTicketPrice + milesBetweenCities / 10;

         System.out.println("The ticket price from " + city1 + " to " + city2 +" is $" + totalPriceAfterMiles);


     }
}
