package com.cydeo.Day27_AcessModifier;

public class TestCircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);//pi value is same  for all objects because is static variable

//          calling the static through  object is not preferred way
           // static  variable needs  to call through class name
//        System.out.println(circle1.pi);
//        System.out.println(circle2.pi);
//        System.out.println(circle3.pi);


        System.out.println(Circle.pi);//one copy and preferred way
       // System.out.println(Circle.radius); instance can't be call through class

    }



}
