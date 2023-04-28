package com.cydeo.Day28_OOP_concepts.polymorphism;

import com.cydeo.Day28_OOP_concepts.inheritance.shape_methodOverriding.Circle;

public class TestEqualsMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); //false// two different objects // in different memory heap location
        System.out.println(circle1.equals(circle2));//
        System.out.println(circle1.equals(circle3));

    }
}
