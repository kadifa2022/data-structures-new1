package com.cydeo.day38_exceptions.shapeTask;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if(radius<=0){
            throw  new InvalidShapeException("Radius of the circle can not be negativ or zero:" + radius);
        }
        this.radius = radius;
    }
}
