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
        input.nextLine(); // to clear the scanner additional method

        System.out.println("Enter your Street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String stateName = input.nextLine();

        System.out.println("Enter your zipCode");
        String zipcode = input.next();


        System.out.println("full_name" + full_name);
        System.out.println("building_number "  + building_number);
        System.out.println("Street name " + streetName);
        System.out.println("City name" + cityName);
        System.out.println("State " + stateName );
        System.out.println("ZipCode" + zipcode);

        //----------------------------------------------
        System.out.println("Your shipping address is:");
        System.out.println("\t" + full_name);
        System.out.println("\t" + building_number+" " + streetName);
        System.out.println("\t" + cityName + ", " + stateName + " " +zipcode );

        input.close();

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

        1.7 Display the shipping address
        Ex:
        Your shipping address is:
        John Smith
        7925 Jones Branch Dr
        McLean, VA 22012

 */
