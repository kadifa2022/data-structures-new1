package co.cydeo.lab7_ClassAndObject;

public class Car {

    public String brand;

    public String model;
    public int year;
    public String color;
    public double price;

    public void setInfo(String brand, String model, int year, String color, double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }



     public String toString() {return brand + " " + model + " " + year + " " + color + " " + price; }

    public void drive(){
        System.out.println("Driving " + brand + " " +model);
    }

}


