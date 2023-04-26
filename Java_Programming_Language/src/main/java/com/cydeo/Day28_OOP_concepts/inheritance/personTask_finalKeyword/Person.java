package com.cydeo.Day28_OOP_concepts.inheritance.personTask_finalKeyword;

import java.time.LocalDate;

public class Person {
    //instances
    private String name;
    private final char gender;     // final required initialize before used or use constructor
    private final int age;           //
    private final LocalDate dateOfBirth;




    public static final int  numberOfHead;
    static{
        numberOfHead = 1;
    }

    public Person(String name, char gender, LocalDate dateOfBirth) {// constructor
        setName(name);
        if(!(gender=='M' || gender =='F')){ //if is final variable we can set condition in constructor only because we can not generate setter
            System.err.println("Invalid gender:" + gender);
           System.exit(1);
        }
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = LocalDate.now().getYear() -dateOfBirth.getYear();
    }
//If is instance variable is final, we can only generate getter //no setter
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {//we can to generate setter for final
        this.name = name;
    }

    public void eat(){
        System.out.println(name + "is eating");
    }
    public void sleep(){
        System.out.println(name + "is sleeping");
    }
    public void drink(){
        System.out.println(name + " is drinking water");
    }
    public final void breath(){//to make sure that this implementation will not change in sub-class
        System.out.println(name + " is breathing");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
/*
Variables:
     name, gender, age, dateOfBirth
     numberOfHead
     Methods:
     eat(), drink(), sleep()
     breath()
 */