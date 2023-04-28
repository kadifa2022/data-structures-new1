package com.cydeo.Day28_OOP_concepts.polymorphism;

import java.util.Arrays;

public class IPhone {


    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;
    // constructor with arguments
    public IPhone(String brand, String model, String size, double price, String color) {//constructor -> child class must cal parent constructor
        setBrand(brand);//set checked the condition before
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);

    }

    public String getBrand() {//getter and setter are instants methods
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[]colors = {"Black", "White","Silver", "Gold", "Pink"};//created [] of the colors
        if(Arrays.asList(colors).contains(color)){//contains method
            this.color = color;
        }else{
            System.err.println("Invalid color:" + color + "\n color of the phone only can be:" +Arrays.toString(colors));
            System.exit(1);
        }
        this.color = color;
    }
    public void call(long phoneNumber){
        System.out.println(getModel()+ " is calling " + phoneNumber);

    }
    public void text(long phoneNumber){
        System.out.println(getModel()+ " is texting to " + phoneNumber);

    }
    @Override
    public String toString() {//getClass come from Object class toSting() to print
        return getClass().getSimpleName() + "{" + // getSimpleName() to get the class name
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {// comparing two Iphone
        // added condition
        if (!(obj instanceof IPhone)) {// if the given object is not IPhone
            System.err.println("Invalid object, Object must be IPhone");
            System.exit(1);
        }

        if (obj instanceof IPhone) {//first condition -> if the given objects is IPhone
            if (model.equals(((IPhone) obj).model)) {//second condition-> if the model of the IPhone is equal to the given iphone' model
                //   if(color.equals( ( (IPhone)obj ).color) ){// third condition-> if the color of the Iphone is equal to the given iphone' color
              //  return true;
            }
            return true;

        }
        return false;


    }
}
