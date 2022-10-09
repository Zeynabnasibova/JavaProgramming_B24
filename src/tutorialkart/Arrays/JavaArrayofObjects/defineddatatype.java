package tutorialkart.Arrays.JavaArrayofObjects;

public class defineddatatype {

    public static void main(String[] args) {


        /*
Java – Array of Objects
You might have already created array of integers, strings, floats, etc., which are primitive and mostly well known datatypes. In this tutorial, we will learn how to create an Array of user defined datatype or simply called, class objects.
You can create an array of objects just like how you create an array of integers. The syntax remains same.

         */

        //className arrayName[] = new className[size];

/*
where
className is the name of class, whose objects we store in the array.
arrayName is the name of the array using which we will access its elements.
new keyword that allocates memory based on the size of array.
 */


        /*
        Example – Java Array of User Defined Class Type
In this example, we will define a class named Car, and in our main method, we will create an array of objects of type Car.
         */

        Car cars[] = new Car[4];

        cars[0] = new Car("Toyota", 56600);
        cars[1] = new Car("Honda", 63500);
        cars[2] = new Car("Tata", 87400);
        cars[3] = new Car("Hyundai", 63000);

        for(Car car: cars)
            car.printDetails();
    }
}

class Car {
    public String name;
    public int miles;

    public Car(String name, int miles) {
        this.name = name;
        this.miles = miles;
    }

    public void printDetails() {
        System.out.println(name+" - "+miles);
    }

}
