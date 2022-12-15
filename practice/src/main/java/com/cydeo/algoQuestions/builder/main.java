package com.cydeo.algoQuestions.builder;

public class main {

    public static void main(String[] args) {

        var tShirt= BuilderTshirt.builder()
                .size("L")
                .color("blue")
                .company("Cydeo")
                .company("Java")
                .build();


        System.out.println("BuilderTshirt = " + tShirt);



    }
}
