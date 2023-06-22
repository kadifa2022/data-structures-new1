package com.cydeo.string;
import java.sql.SQLOutput;
import java.util.Scanner;  //has to be before class


public class ShippingAddress {

    public static void main(String[] args) {
       //store variable and data must be same //created scanner object
       Scanner input = new Scanner(System.in);


        System.out.println("enter your full name");
        String full_name = input.nextLine(); // storing variable //next() reads input only to the space

        System.out.println("Enter your building number:");
        String building_number = input.next();// we assume will be only one word
        // if i use nextLine() after next() a have to add additional nextLine() to clean scanner
        input.nextLine(); // to clear the scanner

        System.out.println("Enter your Street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        System.out.println("Enter your state");
        System.out.println("Enter your zipCode");


        System.out.println("full_name" + full_name);
        System.out.println("building_number "  + building_number);

    }


}
/*
1. Create a class named ShippingAddress and ask user to:
        1.1 Enter your full name(nextLine())
        1.2 Enter your building number(next())
        1.3 Enter your street name (nextLine())
        1.4 Enter your city name (nextLine())
        1.5 Enter your state (nextLine())
        1.6 Enter your zipCode (next())

 */
