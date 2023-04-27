package com.cydeo.Day28_OOP_concepts.abstraction.animalTask_withInterface;

public class Eagle extends Animal implements Flyable,WildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle" + getName()+ " is eating snake");


    }

    @Override
    public void fly() {
        System.out.println("Eagle " +getName()+ " is  flying");

    }

    @Override
    public void hunt() {
        System.out.println();

    }
}
