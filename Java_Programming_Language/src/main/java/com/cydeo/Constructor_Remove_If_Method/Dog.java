package com.cydeo.Constructor_Remove_If_Method;

public class Dog {

    public String name;
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;



    public void setInfo(String name, String breed, String size, char gender, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;

    }


    public void eat(){
        System.out.println(name + "is eating");
    }
    public void drink(){
        System.out.println(name + "is drinking water");
    }



    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }


}
