package com.cydeo.Practice.List;

import java.util.ArrayList;
import java.util.List;

public class ForEach {


    public static void main(String[] args) {


        List<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(2);
        arrList.add(2);
        arrList.add(0);

        int i = 0; // variable for index created

        for (int each : arrList) {
            System.out.println(each + " " + i);
            i++;

        }
    }
}