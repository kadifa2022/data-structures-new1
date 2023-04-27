package com.cydeo.Day28_OOP_concepts.abstraction.animalTask_withInterface;

public class Duck extends Animal implements Playable, Flyable,Swimmable{

    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

        System.out.println("Duck " + getName()+ " is eating grass");

    }

    @Override
    public void fly() {
        System.out.println("Duck " +getName() + " is flaying ");

    }

    @Override
    public void play() {
        System.out.println("Duck" + getName()+ " is playing ");

    }

    @Override
    public void swim() {
        System.out.println();

    }
}
