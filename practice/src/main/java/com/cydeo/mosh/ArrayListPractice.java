package com.cydeo.mosh;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        list.contains(40);//boolean
        list.indexOf(20);
        list.size();
        list.toArray();// convert arrayList to array
        list.lastIndexOf(30);


        System.out.println(list);
    }
}
