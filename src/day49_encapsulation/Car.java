package day49_encapsulation;

public class Car {

        public static void main(String[] args) {


            Car car = new Car("James", "LC007", 40);
            //createed Car object
            System.out.println(car.driver);
            System.out.println(car.driver.name);
            System.out.println(car.driver.age);



        }


    Driver driver;//referance
    //String name;//referanc

    public Car(String name, String licenseNumber, int age){//car class costroctor
        driver = new Driver(name, licenseNumber, age);

    }

   /*
    String driver;// name, licnum, age

    String engine;//cylinder, horesepower
*/

class Driver{//information instance variable

    String name;
    String licenseNumber;
    int age;

    public Driver(String name,String licenseNumber, int age){//constructor
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", age=" + age +
                '}';
    }
}


}
