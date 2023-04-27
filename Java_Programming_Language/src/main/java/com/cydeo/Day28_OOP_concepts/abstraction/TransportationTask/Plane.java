package com.cydeo.Day28_OOP_concepts.abstraction.TransportationTask;

// to ignore abstract methods from parent class we make abstract this class Plane


import com.cydeo.Day28_OOP_concepts.abstraction.animalTask_withInterface.Flyable;

public abstract class Plane extends Transportation implements Flyable {

    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void land(){
        System.out.println("Plane "+ getMake() + " " + getModel()+ "is landing");
    }

    @Override
    public void fly() {// from flyable interface
        System.out.println(getMake()+" "+getModel()+ " is flying");

    }
}
