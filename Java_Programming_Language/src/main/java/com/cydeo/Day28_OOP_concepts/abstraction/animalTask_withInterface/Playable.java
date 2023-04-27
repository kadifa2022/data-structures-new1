package com.cydeo.Day28_OOP_concepts.abstraction.animalTask_withInterface;

public interface Playable {
    // only public access modifier and  is giving implicitly by default
    boolean isFriendly= true; // static and final
/*
 // private is added by Java version 9
    public static void main(String[] args) {

       // isFriendly = false;// can't reassign because is final
        System.out.println(isFriendly);
    }
    public default void method1(){// can be given and by default is public

    }*/

    public abstract void play();// by default is public abstract
}
