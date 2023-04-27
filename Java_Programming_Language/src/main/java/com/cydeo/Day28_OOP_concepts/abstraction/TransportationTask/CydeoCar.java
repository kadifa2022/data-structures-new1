package com.cydeo.Day28_OOP_concepts.abstraction.TransportationTask;

import com.cydeo.Day28_OOP_concepts.abstraction.animalTask_withInterface.Flyable;
import com.cydeo.Day28_OOP_concepts.abstraction.animalTask_withInterface.Swimmable;

public class CydeoCar extends Car implements Flyable, Electric, AutoPilot, Swimmable {

    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
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

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
