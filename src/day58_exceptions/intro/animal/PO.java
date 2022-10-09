package day58_exceptions.intro.animal;

public class PO extends Panda{

    @Override
    public PO getAnimal(){
        return new PO();
    }
}