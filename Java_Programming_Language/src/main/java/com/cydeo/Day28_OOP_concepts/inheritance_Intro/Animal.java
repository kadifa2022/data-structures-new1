package com.cydeo.Day28_OOP_concepts.inheritance_Intro;

public class Animal {//parent/super class only exist for child classes
    //attributes:
    private String name;
    private String breed;
    private char gender;
    private int age;
    private String  size;
    private String color;

    public static boolean isAnimal;//static variable
    static{
        isAnimal = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }
    //methods
    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking water");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    @Override
    public String toString() {// to include class name //  not parent class
        return getClass().getSimpleName()+"{" + // get you class name getSimpleName()
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
