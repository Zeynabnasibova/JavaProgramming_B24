package day56_polymorphism.transportation;

import day54_abstraction.abstract_class.Tesla;

public class Road {

    public static void main(String[] args) {

        Transportation obj1 = new Transportation();
        obj1.go();

        // Car objects

        Car obj2 = new Car();
        obj2.go();
        obj2.openTrunk();

        System.out.println();

        Transportation obj3 = new Car();
        obj3.go();
        // obj3.openTrunk(); Transportation reference for the car does not have access to the openTrunk method

        Tesla t1 = new Tesla(); // itself

//        Car t2 = new Tesla(); // super
//
//        Transportation t3 = new Tesla(); // super
//
//        SelfDrivable t4 = new Tesla();
//
//        Electric t5 = new Tesla();


    }
}