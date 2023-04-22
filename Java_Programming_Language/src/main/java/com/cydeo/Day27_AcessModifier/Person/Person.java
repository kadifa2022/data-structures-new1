package com.cydeo.Day27_AcessModifier.Person;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;
    public static String planet;
    public static boolean isHuman ;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;

    public Person(String name) {//allows us to create person object just by setting the name of the person
    this.name = name;
    }

    public Person(String name, int age) {//name and age

        this(name);//calling first constructor
        this.age = age;
    }
    public Person(String name, String language){
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this(name, age) ;
        this.gender= gender;

    }
    public Person(String name, int age , char gender, String language){
        this(name, age, gender);
        this.language = language;
    }
    static {//static block
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings =0;
        numberOfHead =1;
    }
    public static void printPlanetName(){
        System.out.println("Planet name is: " + planet);
    }
    public void eat(String food){
        System.out.println(name + "is eating " + food);
    }
    public void drink(String drink){
        System.out.println(name + "is drinking " + drink);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet ='" + planet + '\'' +
                '}';
    }
}
