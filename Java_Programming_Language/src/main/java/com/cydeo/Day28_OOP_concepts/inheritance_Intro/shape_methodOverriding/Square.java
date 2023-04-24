package com.cydeo.Day28_OOP_concepts.inheritance_Intro.shape_methodOverriding;


public class Square extends Shape { // no compile error because no parameter in constructor

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }


    @Override
    public void drew() {
        super.drew();
        System.out.println("\t* * * * * *");
        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");
        }


        System.out.println("\t* * * * * *");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + getName() + '\'' +
                " ,side='" + side + '\'' +
                " ,area='" + area() + '\'' +
                " ,perimeter ='" + perimeter() + '\'' +
                '}';

    }
}