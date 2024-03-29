package com.cydeo.Day28_OOP_concepts.inheritance.animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {


        Cat cat = new Cat("Cupy", "Toksido", 'F', 4, "Small", "Black and white");
        Dog dog = new Dog("Max", "Husky", 'M', 3, "Large", "White");
        Lion lion = new Lion("Simba", "African Lion ", 'M', 6, "Large", "Yellow", true);
        Eagle eagle = new Eagle("Bella", "American Eagle", 'F', 4, "Medium", "Black and White");


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);


        System.out.println("----------------------");
        cat.eat();
        dog.eat();
        eagle.eat();
        lion.eat();
        System.out.println("-----------------------");

        cat.sleep();
        dog.sleep();
        eagle.sleep();
        lion.sleep();
    }
}


