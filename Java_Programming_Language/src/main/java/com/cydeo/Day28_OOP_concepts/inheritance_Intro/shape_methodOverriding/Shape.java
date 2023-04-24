package com.cydeo.Day28_OOP_concepts.inheritance_Intro.shape_methodOverriding;

public class Shape {

    private String name;

    public Shape() {//default constructor to set up the name of the shape
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }
    public void drew(){
        System.out.println("Drawing a " + getClass().getSimpleName());

    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                " ,area='" + area()+ '\'' +
                " ,perimeter ='" + perimeter() + '\'' +
                '}';
    }
}

