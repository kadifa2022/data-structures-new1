package com.cydeo.Day28_OOP_concepts.polymorphism;

import com.cydeo.Day28_OOP_concepts.inheritance.shape_methodOverriding.Circle;

public class Circle_overrideEqualsMethod {// equals() is used to comparing the values of the objects

    private double radius;
    public final static double PI = 3.14;

    public Circle_overrideEqualsMethod(double radius) {
       setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * PI;

    }

    public double perimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle_overrideEqualsMethod{" +
                "radius=" + radius +
                "area=" + area() +
                "perimeter=" + area() +
                '}';
    }

    @Override// this Equals() was inherit from object.class ->converting to circle
    public boolean equals(Object obj) { // equals method from Object class, can take any objects
        if (!(obj instanceof Circle)) {;// if the specified object is not circle, then would not compare them
        System.err.println("Invalid object");
        System.exit(1);
                    // return super.equals(obj);
        }
    if(this.radius == ( (Circle)obj ).radius ){ // if the curren circle radius ia equal to the given radius, then two circle are equals
        return true;
    }
    return false;

}
    // == comparing objects two string
    // .equals() is used to comparing the values of the objects
}
