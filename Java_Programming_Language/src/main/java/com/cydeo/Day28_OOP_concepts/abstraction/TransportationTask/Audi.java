package com.cydeo.Day28_OOP_concepts.abstraction.TransportationTask;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {
        System.out.println(getMake()+" " + getModel()+ " is transporting people");

    }

    @Override
    public void start() {
        System.out.println("");

    }

    @Override
    public void autoPark() {
        System.out.println("");

    }
}
