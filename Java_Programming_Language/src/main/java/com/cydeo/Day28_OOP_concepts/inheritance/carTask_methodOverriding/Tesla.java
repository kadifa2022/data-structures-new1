package com.cydeo.Day28_OOP_concepts.inheritance.carTask_methodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{


    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }
    public void autoPilot(){
        System.out.println(getMake()+ " "+ getModel()+ "is in self-driving mode");

    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+getMake()+ " " + getModel());
    }

    @Override
    public void setModel(String model) {// setters
        //String[] models = {"Model S", "Model Y", "Model x", "Model 3"}; //one way to add
        //if(!Arrays.asList(models).contains(model)){//if specified model is not valid

        ArrayList<String> models = new ArrayList<>();//another way
        models.addAll(Arrays.asList("Model S", "Model Y", "Model x", "Model 3"));
        if(!models.contains(model)){
            System.err.println("Invalid Tesla Model:" + model);
            System.exit(1);
        }
        super.setModel(model);// this.model= model; to be set to instants method of the model
    }

    @Override
    public void setColor(String color) {//setters
//        String []colors = {"White","Red", "Black","Silver", "Blue", "Brown", "Green"};
//        if (!Arrays.asList(colors).contains(color)) {//if specified color does exist
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White","Red", "Black","Silver", "Blue", "Brown", "Green"));
        if(!colors.contains(color)){//if arrayList not contain specified color
            System.err.println("Invalid Tesla color:" +color);//error message
            System.exit(1);// terminate program
        }
        super.setColor(color);//this.color = color;
    }

    @Override
    public void setYear(int year) {
        if(year<2008){
            System.err.println("Invalid year of the Tesla car: "  +year);
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if(price<50000){
            System.err.println("Invalid price of the Tesla " + price);
            System.exit(1);
        }
        super.setPrice(price);// including parent setter
    }
}
/*

5. TESLA
     Extra conditions for the variables:
1.Model of Tesla can be set to one of the followings:
     {"Model S", "Model Y", "Model x", "Model 3"}
2. Color of Tesla can be set to one of the following:
     {"White","Red", "Black","Silver", "Blue", "Brown", "Green"}
3.  Year of the Tesla can not be less than 2008
4.  Price of the tesla can not be less than 50k

 */