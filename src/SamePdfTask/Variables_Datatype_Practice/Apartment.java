package SamePdfTask.Variables_Datatype_Practice;

public class Apartment {
    public static void main(String[] args) {

        /*
        create a class named Apartment
        create a main method
        Create the variables with the most appropriate datatype:
        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease,         total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has airconditioning,          number of parking spaces, has wheel chair access, number of review stars (out of 5)
        - Create these variables and use previous variables to get the values
        - monthly rent after 3 years (discount 10% off original rent)
        - monthly rent after 6 years (discount 20% off original rent)
        - Average number of residents per unit (total residents / number of units)
        - Average number of parking spots per unit ( parking spots / units)
        - Average number of units per floor ( units / number of floors)
         */
        String address = "Maitland Crossing way, Orlando, FL 32810",
                nameOfOwner = "Anar Nasibov",
                phoneNumberOfOwner = "123455666";
        int numberOfUnits = 3,
                averageSizeOfEachUnit = 20,
                monthRentAmount =1085,
                numberOfWashersAndDriers =1,
                totalNumberOfResidentsInBuilding = 200,
                numberOfFloors =3,
                numberOfParkingSpaces =200,
                numberOfRevierStars = 4;
        boolean allowPets =false,
                hasAPool = true,
                lenghtOfLease =true,
                isNearAGasStation = true,
                hasABasement = false,
                hasAvailableUnitsForRent = true,
                hasAirConditioning = true,
                hasWheelChairAccess = true;
        //- Create these variables and use previous variables to get the values
        System.out.println("Apartment General Information:\n");
        System.out.println("Addres: "+address+
                "\n Name of owner: "+nameOfOwner+
                "\n Number of units: "+numberOfUnits+
                "\n Average size of each unit: "+averageSizeOfEachUnit+
                "\n Monthly rent amount: "+monthRentAmount+
                "\n Number of washers and driers: "+numberOfWashersAndDriers+
                "\n Allows pets: "+allowPets+
                "\n Has a pool: "+hasAPool+
                "\n Length of lease: "+lenghtOfLease+
                "\n Total number of residents in building: "+totalNumberOfResidentsInBuilding+
                "\n Phone number of owner: "+phoneNumberOfOwner+
                "\n Near a gas station: "+isNearAGasStation+
                "\n Number of floors: "+numberOfFloors+
                "\n Has a basement: "+hasABasement+
                "\n Has available units for rent: "+hasAvailableUnitsForRent+
                "\n Has airconditioning: "+hasAirConditioning+
                "\n Number of parking spaces: "+numberOfParkingSpaces+
                "\n Has wheel chair access: "+hasWheelChairAccess+
                "\n Number of review stars (out of 5): "+numberOfRevierStars);

        //- monthly rent after 3 years (discount 10% off original rent)
        //-monthly rent after 6 years (discount 20% off original rent)

        double newRentAfter3Years = monthRentAmount * 0.9,    //Monthly Rent after 3 years
                newRentAfter6Years = monthRentAmount * 0.8;  //Monthly Rent after 6 years


        System.out.println("\n monthly rent after 3 years: " + newRentAfter3Years+
                "\n monthly rent after 6 years: " + newRentAfter6Years);

        //Average number of residents per unit (total residents / number of units)
        System.out.println("\n Average number of residents per unit:" + totalNumberOfResidentsInBuilding/averageSizeOfEachUnit);
        //- Average number of parking spots per unit ( parking spots / units)
        System.out.println("Average number of parking spots per unit: " + numberOfParkingSpaces/numberOfUnits);
        //Average number of units per floor ( units / number of floors)
        System.out.println("Average number of units per floor: " + numberOfUnits/numberOfFloors);
    }


}
