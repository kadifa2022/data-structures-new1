package com.cydeo.Constructor_Remove_If_Method;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default constructor");// we can have more than one constructor in the class
    }
    //constructor overloaded -> different parameter
    // this.: to call instance variables & instance methods
    // this(): used to call constructor // can be used inside another constructor
    // only  a constructor can call another constructor
    //constructor call has to be in first step
    public ConstructorCalls(int a){
        this();// has to be in first step
        System.out.println("Constructor with int argument");
        //this(); constructor call  has to be on at first step

    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument ");
    }
    public ConstructorCalls(String c){
        this(2.5);
        //this();
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        method1();

    }
    public static void method1(){
        //ConstructorCalls();
        //this();
        System.out.println("Methode 1");

    }

    public static void method2(){
        method1();
        System.out.println("Methode 2");

    }
}
