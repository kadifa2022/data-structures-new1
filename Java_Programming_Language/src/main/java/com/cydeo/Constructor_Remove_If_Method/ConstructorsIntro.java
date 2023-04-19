package com.cydeo.Constructor_Remove_If_Method;

import java.util.concurrent.Callable;

public class ConstructorsIntro {
    public ConstructorsIntro(){
        System.out.println("Object is created by using noArgConstructor");}
    public ConstructorsIntro(int a){
        System.out.println("Object is created by using int ArgConstructor");}
    public void add(){

    }

    public static void main(String[] args) {

       // new ConstructorsIntro();//no ArgConstructor default

       ConstructorsIntro obj1 = new ConstructorsIntro(10);
       ConstructorsIntro obj2 = new ConstructorsIntro();
     //  ConstructorsIntro obj3 = new ConstructorsIntro("Java");
    }
}
