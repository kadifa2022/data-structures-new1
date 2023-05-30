package com.cydeo.javaCore;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement_WithWords {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,3,4,5,2,1,2,3,4};
        String [] words = {"zero", " one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};

        Map<Integer, String> map = new HashMap<>();

        for(int each: arr) {
            int count = 0;
            for (int n : arr) {
                if (each == n){
                count++;
            }
        }
            if(count>10){
                map.put(each, words[each]);
            }else{
                map.put(each, words[count]);
            }
        }
        map.forEach((k,v)-> System.out.println(k+ " is " + v));

    }
}
