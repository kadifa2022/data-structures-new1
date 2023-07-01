package com.cydeo.dsa02CollectionsReview;

public class HashCodeExample {

    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";

        System.out.println(a.hashCode());// same hashcode /memory address / using hashcode function
        System.out.println(b.hashCode());

        Car car1 = new Car("BMW", 1);
        Car car2 = new Car("BMW", 1);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        System.out.println(car1.equals(car2)); // hash code not same // not same objects
        System.out.println(car1==car2);




    }

}
