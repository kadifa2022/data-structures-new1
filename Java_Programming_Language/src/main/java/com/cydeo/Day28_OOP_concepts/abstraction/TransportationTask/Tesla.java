package com.cydeo.Day28_OOP_concepts.abstraction.TransportationTask;

public class Tesla extends Car implements Electric, AutoPilot{


    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {
        System.out.println();

    }

    @Override
    public void start() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }
}
