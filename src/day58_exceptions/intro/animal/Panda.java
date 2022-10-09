package day58_exceptions.intro.animal;


public class Panda extends Animal{

    @Override
    public Panda getAnimal(){
        return new Panda();
    }

}