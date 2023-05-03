package com.cydeo.labs.lab5_string;

public class TestStringObjects {

    public static void main(String[] args) {


        String str1 = new String("Java");  // string object with new keyword outside pool
        String str2 = "Java";// string literal// in the string pool

       String str3= new String ("Java");

       String str4 = "Java";
        System.out.println(str1 == str2);// false not equally
        System.out.println(str2==str4);// true
        System.out.println(str1== str3);//false


    }

}
