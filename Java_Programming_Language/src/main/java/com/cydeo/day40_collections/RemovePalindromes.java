package com.cydeo.day40_collections;

import com.cydeo.utility.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "Civic", "Radar", "Kayak"));


        Iterator<String> it = names.iterator();//create Iterate from collection with iterator()
        while (it.hasNext()) {// to get every single itoration (each element)/ to get true -> than we can use next()
            String each = it.next(); // get each  element
            // is palindrome
            String reverse = "";// declare string variable reverse  another loop

            // reversing the string
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);

            }

            //compare
            if(each.equalsIgnoreCase(reverse)){//if this condition is true that means String is palindrome
                   it.remove();// used
            }


        }

        System.out.println(names);


        System.out.println("-------------------- with lambda expression-----------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "Civic"));

        names2.removeIf(p-> StringUtility.reverse(p).equalsIgnoreCase(p));// reversed() custom ()

       // names2.removeIf(p->new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));

        System.out.println(names2);




    }}