package com.cydeo.Day28_OOP_concepts.abstraction.TransportationTask;

public  abstract class Transportation {

    private final String make, model;
    private String color;
    private final int year;
    private double price;
 //final does not have setter

    public Transportation(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

     public abstract void transportPeople();// no body -> ignore details
     public abstract void start();
     public void stop(){
         System.out.println("Shut off the engine ");

     }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
Create an abstract class  named Transportation
 Variables: make(final), model(final), color, year(final), price

 Encapsulate all fields
  add constructor that can set all the fields
  abstract methods:
  transportPeople();
  start();

  non abstract methods:
  stop(): "Shut off engine"
  to String()
 */