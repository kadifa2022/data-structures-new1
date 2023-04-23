package com.cydeo.Day28_OOP_concepts.inheritance_Intro.phoneTask;

public class Samsung extends Phone{


    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    // unique method

    public void freeze(){
        System.out.println(getBrand() + " "+ getModel() + "freezes");
    }

}
