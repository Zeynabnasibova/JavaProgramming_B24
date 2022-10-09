package day54_abstraction.person;

import day53_inheritance.rules.C;

public class WorkPlace {
    public static void main(String[] args) {

        // Person person = new Person(); cannot create an object of Person because it is an abstract class

        // Employee employee = new Employee(); cannot create an object of Employee because it is an abstract class

        Tester tester = new Tester();
        tester.work();
        tester.sleep(30);
        tester.jobTitle = "Tester";

        Developer developer = new Developer();
        developer.work();
        developer.sleep(20);

        Chef chef = new Chef();
        chef.work();
        chef.sleep(60);

    }
}