package SamePdfTask.Variables_Datatype_Practice;

public class House {

    public static void main(String[] args) {
    /*
        Create a class House
        create a main method
        - Each the datatype you feel is most appropriate for each variable.
        - Create the following variables:
        house type,
        number of bedrooms,
                number of bathrooms,
        number of kitchens,
                is there a basement?,
                is there an attic,
                is there a pool,
                is the house for sale?,
                cost of the house,
                address,
                zipcode,
                is a park near by,
        Rating of surrounding school districts (out of 5),
                - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
        The number of bathrooms is: 3

                */
        byte number_of_bedrooms = 2,
             number_of_bathrooms = 2,
             number_of_kitchens= 1;
        String house_type = "Apartment",
                address = "Maitland Crossing way";
        boolean basement = false,
                attic = false,
                pool = true,
                sale = false,
                park = true;
        int cost = 150000,
            zipcode = 1234,
             schoolDistric = 6;
        System.out.println("House\n" + "House type: "+house_type + "\nNumber of bedrooms: " + number_of_bedrooms + "\nNumber of bathrooms: "+ number_of_bathrooms + "\nNumber of kitchens: "+ number_of_kitchens + "\nHave basement: " + basement + "\nHave attic: " + attic + "\nHave a pool: " + pool + "\nHouse for sale: " + sale + "\nCost of the house: $" + cost + "\nAddress: " + address + "\nZip code: " + zipcode + "\nPark near: " + park + "\nRating of surrounding school districts: "  + schoolDistric);

    }
}
