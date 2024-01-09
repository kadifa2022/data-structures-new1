package com.cydeo.mosh;


import com.cydeo.day2_arrays.Array;

import java.util.Arrays;

public class PracticeAlgorithm1 {

    public static void main(String[] args) {
        int[] numbers= {10, 20, 30}; // array
        System.out.println(numbers.length); // the size of the array 3 items
        System.out.println(Arrays.toString(numbers)); // prints array

     /*   Array numbers2 = new Array(3);// initial array is 3
        numbers2.insert(10);
        numbers2.insert(20);
        numbers2.insert(30);
        numbers2.insert(40);
        numbers2.removeAt(3); // removing last item
      //  numbers2.print(); print method
        System.out.println(numbers2.indexOf(10));// returning index of item(0)


      */
        Array numbers3 = new Array(4);
        numbers3.insert(2);
        numbers3.insert(4);
        numbers3.insert(6);
        numbers3.insert(8);
        numbers3.removeAt(2);
        System.out.println(numbers3.indexOf(2));
        numbers3.print();

//
        }
    }