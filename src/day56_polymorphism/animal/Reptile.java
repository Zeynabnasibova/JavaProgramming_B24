package day56_polymorphism.animal;

public class Reptile extends  Animal{

    @Override
    public void eat() {
        super.eat();

        System.out.println("Reptile is eating -- From REPTILE");
    }
}
