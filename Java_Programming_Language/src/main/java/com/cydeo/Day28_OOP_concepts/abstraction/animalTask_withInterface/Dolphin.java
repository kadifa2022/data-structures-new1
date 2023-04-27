package com.cydeo.Day28_OOP_concepts.abstraction.animalTask_withInterface;

public class Dolphin extends Animal implements Playable, Swimmable{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin " +getName()+ " is eating fish");

    }

    @Override
    public void play() {
        System.out.println("Dolphin" +getName()+ " is playing");

    }

    @Override
    public void swim() {

        System.out.println();

    }
}
