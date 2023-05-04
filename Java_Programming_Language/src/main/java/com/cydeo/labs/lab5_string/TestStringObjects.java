package com.cydeo.labs.lab5_string;

public class TestStringObjects {

    public static void main(String[] args) {


        String str1 = new String("Java");  // string object with new keyword outside pool
        String str2 = "Java";// string literal// in the string pool

       String str3= new String ("Java");

       String str4 = "Java";
        System.out.println(str1 == str2);// false not equally
        System.out.println(str2==str4);// true
        System.out.println(str1== str3);//false== operator is checking if is the one object same as other object

        System.out.println(str1.equals(str2));// value of one object equals of the value of another objects


       str1.endsWith("2");
        /*
        String is sequences of characters
        String Methods;
        substring()
        charAt()
        length()
        indexOf(),(lastIndexOf),
        lower/upper().
        replace, (replaceFirst)
        equals(),
        contains()
        startWith/endWith()
         */
    }

}
