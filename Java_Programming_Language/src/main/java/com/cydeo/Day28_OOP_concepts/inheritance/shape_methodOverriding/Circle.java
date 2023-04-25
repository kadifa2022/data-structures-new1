package com.cydeo.Day28_OOP_concepts.inheritance.shape_methodOverriding;

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
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                " ,radius='" + radius + '\'' +
                " ,area='" + area() + '\'' +
                " ,perimeter ='" + perimeter() + '\'' +
                '}';

    }
    @Override
    public void drew() {
        super.drew();
        System.out.println(" \t   * * *");
        for (int i = 0; i < 3; i++) {
            System.out.println("  \t*         *");
        }


        System.out.println(" \t   * * *");
    }


}
