package com.cydeo.Day28_OOP_concepts.abstraction.animalTask_withInterface;

public class Dog extends Animal implements Playable{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog" + getName()+ " is eating dog food");

    }

    @Override
    public void play() {
        System.out.println("Dog " + getName()+ " is playing");

    }

    public void bark(){
        System.out.println(getName()+"is barking");
    }
}
