package com.cydeo.arraysVsArrayList;

import com.cydeo.day2_arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysVsArrayList {
    public static void main(String[] args) {//must specify size// index
        //create
      //  String [] friendsArray = new String[4]; //must declare size -can't be changed//fixed size/primitive, non-primitive
        String [] friendsArray =  {"John", "Chris", "Eric", "Luke"};


      //  ArrayList<String> friendsArrayList = new ArrayList<>();//can shrink and grow dynamically/only primitive (objects)
        ArrayList<String> friendsArrayList2 =
                new ArrayList<>(Arrays.asList("John", "Luke", "Eric", "Chris"));//can be changed// index
        //get elements
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList2.get(1));

        System.out.println(friendsArray.length);//field call
        System.out.println(friendsArrayList2.size());// method call

        //add an element
        //we cant add elements with array :(

        //element added to array list can grow dynamic
        friendsArrayList2.add("Mitch");
        System.out.println(friendsArrayList2.get(4));

        // set an element
        friendsArray[0]= "Carl";
        System.out.println(friendsArray[0]);
        friendsArrayList2.set(0, "Carl");
        System.out.println(friendsArrayList2.get(0));

        //remove an element
        //Can't do this with arrays:(
        friendsArrayList2.remove("Chris");
        System.out.println(friendsArrayList2.get(1));

        //print
        System.out.println(friendsArray);
        System.out.println(friendsArrayList2);




     }


}
