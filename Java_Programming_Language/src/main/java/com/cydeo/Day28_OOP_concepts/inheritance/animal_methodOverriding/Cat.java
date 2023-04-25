package com.cydeo.Day28_OOP_concepts.inheritance.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    //static, private and final() can't be override
    //only instant(), and same() from parent class-> access modifier must be the same or  more visible
    @Override // if @ gives you compile error method is not override
    public void eat(){//same method different implementation
        System.out.println("Cat " + getName()+ "is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat "+ getName()+ " sleeps 12 hours in a day");
    }


    public void scratch(){
        System.out.println("Cat " + getName() + " is scratching");
    }
}
