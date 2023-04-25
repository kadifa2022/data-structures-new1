package com.cydeo.Day28_OOP_concepts.inheritance.animalTask;

public class Cat extends Animal{


    public void scratch(){
        System.out.println(getName()+ " is scratching");//unique action for cat
    }
    public void meow(){
        System.out.println(getName() + " is meowing");
    }


}
