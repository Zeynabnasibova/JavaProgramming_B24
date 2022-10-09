package day51_inheritance;

public class AudioBook extends Book {//Book parent class
    double duration;
    String narrator;

    public void listen(){
        System.out.println("Listening to " + title + " narrated by " + narrator);
    }

}

// AudioBook is a Book
