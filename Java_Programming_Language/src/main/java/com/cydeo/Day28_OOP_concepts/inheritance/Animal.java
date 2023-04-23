package com.cydeo.Day28_OOP_concepts.inheritance;

public class Animal {//parent/super class only exist for child classes
    //attributes:
    public String name;
    public String breed;
    public char gender;
    public int age;
    public int size;
    public String color;

    public static boolean isAnimal;//static variable
    static{
        isAnimal = true;
    }

    public void setInfo(String name, String breed, char gender, int age, int size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }
    //methods
    public void eat(){
        System.out.println(name + "is eating");
    }

    public void drink(){
        System.out.println(name+ "is drinking water");
    }
    public void sleep(){
        System.out.println(name+ "is sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
