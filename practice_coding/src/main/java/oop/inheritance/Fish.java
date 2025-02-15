package oop.inheritance;

public class Fish extends Animal{


    public Fish(String name, String bread, char gender, int age, String size, String color) {
        super(name, bread, gender, age, size, color);
    }

    public void swim(){
        System.out.println(name + "is swimming under water");
    }


}
