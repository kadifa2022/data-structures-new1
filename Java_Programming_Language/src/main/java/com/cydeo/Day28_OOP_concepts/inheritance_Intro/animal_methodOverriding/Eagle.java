package com.cydeo.Day28_OOP_concepts.inheritance_Intro.animal_methodOverriding;

public class Eagle extends Animal{


    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle " + getName() + " is eating snakes");
    }

    public void fly(){
        System.out.println("Eagle " + getName()+ " is flying");
    }
}
