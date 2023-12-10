package com.cydeo.Practice.List;

import java.awt.*;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        System.out.println(Circle.getNumberOfCircles());

        Circle circle = new Circle(new Point(1,2), 3 );
        Circle circle2 = new Circle(new Point(2,3), 3 );
        System.out.println(circle2.getNumberOfCircles());
        System.out.println(circle.getArea());

    }
}
