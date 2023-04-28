package com.cydeo.Day28_OOP_concepts.polymorphism;

import com.cydeo.Day28_OOP_concepts.inheritance.phoneTask.IPhone;
import com.cydeo.Day28_OOP_concepts.inheritance.shape_methodOverriding.Circle;

public class TestEqualsMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); //false// two different objects // in different memory heap location
        System.out.println(circle1.equals(circle2));//
        System.out.println(circle1.equals(circle3));


        System.out.println("---------------------------------------------");

       IPhone iPhone1 = new IPhone("Iphone12", "Large", 1000.5, "Black");
       IPhone iPhone2 = new IPhone("Iphone12", "Large", 1000.5, "Black");

        System.out.println(iPhone1.equals(iPhone2));



    }
}
