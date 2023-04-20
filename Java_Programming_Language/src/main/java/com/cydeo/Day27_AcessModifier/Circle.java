package com.cydeo.Day27_AcessModifier;

import com.cydeo.Constructor_Remove_If_Method.studentTask_constructor.StudentsGroup;

public class Circle {
                                     //constructor to call instants variable
    public double radius, diameter; //instant are location in heap and belong to objects


    public static double pi=3.14; //static variable one copy can be called through class name

    public Circle(double radius){
        this.radius= radius;
        diameter = radius * 2;
    }

//    public static  double calcArea(){//static only accept static//belongs to class member
//        return radius * radius *pi;
//    }

    public double calcArea(){//instanced methode accept static member and belongs to objects
        return radius * radius *pi;
    }

    public double calcPerimeter(){
        return 2 * radius * pi;
    }
    public static void printPiValue(){// if we don't use any instance in method than method can be static
        System.out.println("Pi' value is " + pi);
    }

    @Override
    public String toString() { // to string is instants method and accept static also
        return "Circle{" +
                "radius=" + radius + //instant
                ", diameter=" + diameter +//instant
                ", PI=" + pi +//static
                ", area=" + calcArea() + //returns area
                ", perimeter =" + calcPerimeter() +//returns perimeter
                '}';
    }
}