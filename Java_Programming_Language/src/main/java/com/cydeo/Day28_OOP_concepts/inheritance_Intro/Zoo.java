package com.cydeo.Day28_OOP_concepts.inheritance_Intro;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 4, "Large", "White");
        Cat cat = new Cat();
        cat.setInfo("Felicia","stray" ,'F', 3, "Medium", "Black");
        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M',5,"Large", "Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("------------------------------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();


        tiger.eat();
        tiger.sleep();
        tiger.drink();

        System.out.println("-----------------------------------");
        dog.bark();
        cat.scratch();
        tiger.hunt();


        System.out.println("------------------------");


        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        dog.setGender('F');
        dog.setAge(8);

        System.out.println(dog);

        //Object is the parent CLAS  of all the classes
        // Finalize () implicitly given to all objects
      //  import java.lang.Object;    //parent of all classes

    }
}
