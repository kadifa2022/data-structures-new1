package com.cydeo.Day28_OOP_concepts.polymorphism;

import  com.cydeo.Day28_OOP_concepts.abstraction.animalTask_withInterface.*;
import com.cydeo.Day28_OOP_concepts.abstraction.carTask.Audi;
import com.cydeo.Day28_OOP_concepts.abstraction.carTask.Car;
import com.cydeo.Day28_OOP_concepts.abstraction.carTask.Honda;
import com.cydeo.Day28_OOP_concepts.abstraction.carTask.Tesla;
import com.cydeo.Day28_OOP_concepts.abstraction.employeeTask_Abstraction.*;
import com.cydeo.Day28_OOP_concepts.inheritance.shape_methodOverriding.Circle;

import java.lang.reflect.Array;
import java.util.Arrays;

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


                   //there is not "IS A"relationship between Animal and Tesla
       // Animal animal = new Tesla ("Model Y", "Blue", 2022,60000);

       Animal animal = new Dog("Max", "Husky",'M',4,"Large","White");
       animal.eat();
       animal.drink();
       animal.sleep();

       //animal.play();
       //animal.bark();

       System.out.println("------------------------------------------------------");

        // Different  types of objects
       // parent of all objects are Object class and we can store al objects in []
       String str= "Java";
       Integer n = 100;
       Boolean r = false;
       Double d = 10.5;
       Circle circle = new Circle(4);

       Honda honda= new Honda("Pilot", "Red", 2020, 45000);
       Audi audi = new Audi("Q6", "White", 2022, 50000);
       Tesla tesla= new Tesla("Model Y", "Blue", 2022, 60000);


       Teacher teacher= new Teacher("Daniel", 54, 'M', "A1", "Math Teacher", 85000);

       Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 90000,"Java");
       Driver driver = new Driver("Ilfo", 50, 'M', "D2","Truck driver",80000);
       Tester tester = new Tester("Milojko", 30, 'M',"C3","Tester", 93000);

       //OBJECT class we are using if we have objects from different category


       Object[] objects= {str, n,r, d,circle, developer,honda,audi, tesla,teacher,driver,tester};
       System.out.println(Arrays.toString(objects));

       // same category use parent as reference type
       //benefits-> more specific  to call through Reference/ parent name
       Employee[] employees = {developer, teacher,tester,driver};

      // Object
               Employee obj = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 90000,"Java");
              obj.work(); //work methode will execute from Object type/child  version not from Reference type/parent(reference type makes decision)

       System.out.println("------------------------------------------------------------");







    }
}
