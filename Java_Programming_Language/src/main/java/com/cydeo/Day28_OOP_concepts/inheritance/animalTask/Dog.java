package com.cydeo.Day28_OOP_concepts.inheritance.animalTask;

public class Dog extends Animal{// dog is an animal ->methods and variable
        //Child          // parent
/*
    //importing is borrowing
    public void method(){//inheriting from parent
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);//static

        setInfo();
        eat();
        drink();
        sleep();
        toString();


    }

 */

    public void bark(){
        System.out.println(getName() + " is barking");// defining bark() because is unique for dog only
    }
}
