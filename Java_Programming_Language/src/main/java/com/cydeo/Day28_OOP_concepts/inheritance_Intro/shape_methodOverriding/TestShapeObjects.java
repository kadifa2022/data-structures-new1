package com.cydeo.Day28_OOP_concepts.inheritance_Intro.shape_methodOverriding;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);

        square.drew();

        System.out.println("----------------");
        Circle circle =  new Circle(3.5);

        System.out.println(circle);

        circle.drew();
    }
}
