package com.cydeo.Day28_OOP_concepts.abstraction.carTask;

public class TestCarObjects {

    public static void main(String[] args) {

       // Car ca1 = new Car("X6", "Red", 2020, 45000);abstract class and can't be created object from abstract class
        Honda honda= new Honda("Pilot", "Red", 2020, 45000);
        Audi audi = new Audi("Q6", "White", 2022, 50000);
        Tesla tesla= new Tesla("Model Y", "Blue", 2022, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println(" ------------------------------     ");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("----------------------------------------------");
        honda.start();
        audi.start();
        tesla.start();

        System.out.println("-----------------------------------------------");
        audi.autoPark();
        tesla.autoPilot();
    }


}
