package com.cydeo.Day28_OOP_concepts.inheritance;

public class Cat extends Animal{


    public void scratch(){
        System.out.println(name + " is scratching");//unique action for cat
    }
    public void meow(){
        System.out.println(name + " is meowing");
    }


}
