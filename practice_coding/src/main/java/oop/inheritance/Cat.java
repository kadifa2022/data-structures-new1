package oop.inheritance;

public class Cat extends Animal{

    public Cat(String name, String bread, char gender, int age, String size, String color) {
        super(name, bread, gender, age, size, color);
    }

    public void scratch(){
        System.out.println(name + " is scratching");

    }
}
