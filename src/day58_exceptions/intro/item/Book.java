package day58_exceptions.intro.item;

public class Book extends Item{

    public Book(String name){
        super(name);
    }

    @Override
    public void use(){
        System.out.println("Reading a Book");
    }

}