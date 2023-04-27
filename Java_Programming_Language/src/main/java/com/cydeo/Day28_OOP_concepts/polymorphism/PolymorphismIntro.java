package com.cydeo.Day28_OOP_concepts.polymorphism;

import  com.cydeo.Day28_OOP_concepts.abstraction.animalTask_withInterface.*;

public class PolymorphismIntro {
    public static void main(String[] args) {

       Dog dog = new Dog("Max", "Husky", 'M', 4,"Small", "White");
       Tiger tiger = new Tiger("Lara","Dalmatinar", 'F', 7,"Large","Black and white");
       Cat cat = new Cat("Cupko", "Tucsido",'M', 4, "Medium", "B&W");
       Eagle eagle = new Eagle("Orao", "american", 'M', 4,"Small", "White");
       Lion lion = new Lion("African", "Husky", 'M', 4,"Small", "White");
       Parrot parrot = new Parrot("Max", "Husky", 'M', 4,"Small", "White");
       Dolphin dolphin = new Dolphin("Max", "Husky", 'M', 4,"Small", "White");
       Shark shark = new Shark("Max", "Husky", 'M', 4,"Small", "White");
       Duck duck = new Duck("Max", "Husky", 'M', 4,"Small", "White");

      // Dog[] animals = {dog, cat, tiger, lion, eagle,parrot,dolphin,shark,duck};
      // WildAnimal [] animals = {dog, cat, tiger, lion, eagle,parrot,dolphin,shark,duck};
      // Swimmable[] animals = {dog, cat, tiger, lion, eagle,parrot,dolphin,shark,duck};

      // Animal reference to all objects that have relationship
       //Polymorphism->Parent references to child objects that have relationship
       Animal [] animals = {dog, cat, tiger, lion, eagle,parrot,dolphin,shark,duck};





    }
}
