package murodillT.Arrays;

public class PrintArrayValues {

    public static void main(String[] args) {

        //create an array cars and directly assign following values:
        //Moskvich, Audi, Porsche, BMW, Toyota, Honda, Tesla, Dodge, Kia, Acura, Fiat
        String [] cars = new String []{"Moskvich", "Audi", "Porsche", "BMW", "Toyota", "Honda", "Tesla", "Dodge", "Kia", "Acura", "Fiat"};

        // print number of cars
        System.out.println(cars.length);

        int i = 0;
        System.out.println(cars[i]);
        i++;
        System.out.println(cars[i]);
        i++;i++;
        System.out.println(cars[i]);

        // print all values using a for loop

        for( int j = 0; j < cars.length; j++){

            System.out.print(cars[j] + " ");
        }
       //print all values using a for EACH loop

        System.out.println("--------FOR EACH LOOP--------");
        for( String eachCar : cars ){
            System.out.println(eachCar);
        }

    }
}
