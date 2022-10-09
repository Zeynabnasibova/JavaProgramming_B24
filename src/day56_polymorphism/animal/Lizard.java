package day56_polymorphism.animal;

public class Lizard extends Reptile {

    @Override
    public void eat() {

        System.out.println("Lizard is eating -- FROM CHILD");

    }
}
class Wild {

    public static void main(String[] args) {

        //Make your Lizard object with all references

        Lizard obj1 = new Lizard();

        Reptile obj2 = new Lizard();

        Animal ob3 = new Lizard();

        obj1.eat();
        obj2.eat();
        ob3.eat();



    }
}