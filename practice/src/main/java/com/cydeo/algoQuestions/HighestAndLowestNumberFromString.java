package com.cydeo.algoQuestions;

import com.cydeo.day2_arrays.Array;

import java.util.ArrayList;
import java.util.Collections;

public class HighestAndLowestNumberFromString {

    String HighestAndLowestNumFromString(String str) {
        String[] strings = str.split("");
        ArrayList<Integer> list = new ArrayList<>();
        for(String s: strings){
            list.add(Integer.valueOf(s));
        }
        return Collections.max(list)+ "" +Collections.min(list);

    }
}