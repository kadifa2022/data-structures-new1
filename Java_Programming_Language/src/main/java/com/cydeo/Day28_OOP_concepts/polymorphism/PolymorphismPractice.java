package com.cydeo.Day28_OOP_concepts.polymorphism;


import com.cydeo.Day28_OOP_concepts.abstraction.TransportationTask.*;
import com.cydeo.Day28_OOP_concepts.abstraction.animalTask_withInterface.*;


public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        tiger.eat();//object type will execute if is overridden
        tiger.drink();
        tiger.sleep();
        //tiger.hunt(); cant call this method through reference type -> unique method for tiger object

        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "White");
        // animal.fly();// without changing reference type we can't call fly()
        animal.eat();
        animal.sleep();
        animal.drink();

        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "White");

        obj1.fly();
//        obj1.eat();
//        obj1.sleep();
//        obj1.drink();
        System.out.println(obj1.canFly);


        Lion lion = null;
        Parrot parrot = null;
        Shark shark = null;
        Dolphin dolphin = null;
        Eagle eagle = null;
        Duck duck = null;
        Dog dog = null;
        Cat cat = null;
        CydeoCar cydeoCar = null;

        Flyable[] birds = {parrot, eagle, duck};
        Swimmable[] fishes = {dolphin, shark, duck};
        Playable[] friendlyAnimal = {cat, dog, dolphin, duck};


        // boolean isAnimal = cydeoCar instanceof Animal; // is A relationship

        boolean isAnimal = dog instanceof Animal;
        System.out.println(isAnimal);

        System.out.println("-----------------------------------");

        Car car= new Tesla("Tesla", "Model Y","White", 2020, 55500 );

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;
        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;

        System.out.println("is Tesla = "+ isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectric = "+ isElectricCar);
        System.out.println("hasAutoPark =" + hasAutoPark);
        System.out.println("hasAutoPilot= " + hasAutoPilot);



    }

}
