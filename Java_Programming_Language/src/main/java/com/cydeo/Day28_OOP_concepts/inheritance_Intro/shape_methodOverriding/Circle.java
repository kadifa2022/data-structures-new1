package com.cydeo.Day28_OOP_concepts.inheritance_Intro.shape_methodOverriding;

public class Circle extends Shape{

    public double radius;

    public Circle(double radius) {//constructor for circle class
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
       return radius * radius * 3.14;

    }

    @Override
    public double perimeter() {
        return 6.28 * radius;
    }

    @Override
    public void drew() {
        super.drew();
    }
}
