package com.cydeo.Day28_OOP_concepts.abstraction.carTask_withInterface;

public abstract class Car {// abstract class meant to be inherited, can not be instantiated
    // to make brand unchangeable use final
    // final variable don't have default value that's why we have compiled error
    //final variable must be initial before using-> initially final variable in constructor

    private final String make, model;//can be initial only one time

    private String color;
    private final int year;
    private double price;

    public Car( String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();// to sett the class name to the make of the carr
        this.model = model;
        setColor(color);// private but not final
        this.color = color;// private final
        if(year<1886){// final variable(condition) we can set only through constructor
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);// private but not final
    }
    // we can't generate setter for variable that is final
    // getter can be generated for finals


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
// generated setter only for not final variable
    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if(price<=0 ) {
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }
//protected prevents other sub classes outside package to accessing this features
    //make sure that non-sub
    protected final void stop(){
        System.out.println("Press the brake to stop " + make + " " + model);
    }
    // private access modifier can't be given      static(), private(), final () can't be abstract
    protected abstract void start();// abstract methode meant to b e overridden

    @Override
    public String toString() {
        return  make + "{" +
                " model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}











/*
1. Create an abstract class named Car:
    variables:
    make(final),model(final),color, year(final), price

    Encapsulate all the fields
    Conditions:
    1. year can not be less than 1886
    2. price can not be negative or zero

    Add a constructor that can set al the fields
    note: Class name can b e set  to the make of the car

    Methods:
    stop() (final): prints "Press the b rake"
    start() (abstract)
    toString(): prints the given car info when a car object is passed in the print statement
,
 */