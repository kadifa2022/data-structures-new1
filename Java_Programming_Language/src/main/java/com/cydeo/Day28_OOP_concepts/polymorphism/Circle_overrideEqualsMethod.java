package com.cydeo.Day28_OOP_concepts.polymorphism;

public class Circle_overrideEqualsMethod {

    private double radius;
    public final static double PI=3.14;

    public Circle_overrideEqualsMethod(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius * radius * PI;

    }
    public double perimeter(){
        return 2 * radius * PI;
    }

}
