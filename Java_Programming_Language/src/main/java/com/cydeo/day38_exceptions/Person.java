package com.cydeo.day38_exceptions;

public class Person {

   private String name ;
   private int age;
   private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if(!(gender =='M' || gender=='F')){//of the gender is invsalid
            throw new RuntimeException("Invalid Gender "+ gender);// throws the runtime exception// crash the program
        }
        this.gender = gender;//only in constructor we can set final
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age ==0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if(age <0 || age>150){// if the given age is invalid
           throw new RuntimeException(" invalid age :" + age);// throw runtime exception, and crash the program
        }
        this.age = age;
    }

    public char getGender() {

        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
