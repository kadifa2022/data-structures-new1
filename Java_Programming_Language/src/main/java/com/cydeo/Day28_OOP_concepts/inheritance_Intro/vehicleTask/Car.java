package com.cydeo.Day28_OOP_concepts.inheritance_Intro.vehicleTask;
// WE CREATE CHILD CLASS TO RE USE CODE
public class Car extends Vehicle{
    // MUST CALL PARENT CONSTRUCTOR
    //Restrictions for constructors? - only constructor can call constructor


    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void drive(){
        System.out.println("Driving " + getBrand()+ " " +getModel());
    }


}
