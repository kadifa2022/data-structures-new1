package com.cydeo.Day28_OOP_concepts.inheritance.finalKeyword;

import java.time.LocalDate;

class Student{

   public final void language(){
        System.out.println("Java Programing");
    }
}

public class FinalKeyword extends Student{

//    public void language(){//final method can never be overridden
//        System.out.println("Python Programing");
//    }

    public FinalKeyword(){

    }

    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender);//M

        //gender = 'F'; cna not be re assign compile error

        System.out.println(gender);//F

        System.out.println("------------------------------------");
        //final variable become unchanged
      final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);
        //dateOfBirth = dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);//2023

        System.out.println("------------------------------------");


        new Student().language();
        new FinalKeyword().language();

        System.out.println("------------------------------------");
        // final is protection from GC // immutable
       final  String name ="James";//2 way to eligible for garbage collection
        //name = null;
       // name = "daniel";


        // Sting builder is mutable
    }

}
