package com.cydeo.Day28_OOP_concepts.inheritance_Intro.carTask_methodOverriding;

public class TestCarObjects {


    public static void main(String[] args) {

        Honda honda = new Honda("Accord", "Gray", 2019, 24000);
        Toyota toyota= new Toyota("Camry", "Blue", 2020, 25000);
        Audi audi = new Audi("Q6", "Silver", 2021, 34000);
        BMW bmw = new BMW("X6", "Black", 2017, 30000);
        Tesla tesla = new Tesla("Model 3","White", 2022, 65000);


        System.out.println(honda);
        System.out.println(toyota);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("-------------------------------------");
        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();

        System.out.println("-----------------------------------------");

        //tesla.setPrice(30000);
        tesla.setModel("Model H");
        System.out.println(tesla);
    }
}

