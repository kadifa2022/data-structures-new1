package com.cydeo.Practice.List;

import java.awt.*;

public class Circle {

    Point center;
    double radius;
    static  int numberOfCircles;

    Circle(){
        numberOfCircles++;
    }
    Circle(Point center, double radius){
        numberOfCircles++;
        this.center = center;
        this.radius = radius;
    }

    double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    void setCenter(Point center){
       this.center = center;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    static int getNumberOfCircles(){
        return  numberOfCircles;
    }



}
