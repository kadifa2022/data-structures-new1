package com.cydeo.day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String  str= "bbcccaaaaa";
            // if is String instead of Character we will not need to convert String to charAt()
        Map<Character, Integer> map = new LinkedHashMap<>();
        // we have method frequency() in collection utility class, that we will convert string to collection

        for (String each: str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            //converted string to charAt

                map.put(each.charAt(0),frequency);
            }
        }


    }

/*
1. Write a program that can return the frequancy of characters
 Not: Must use map

 Ex: str = "bbcccaaaaa"

 output:{b=2, c= 3, a= 5}
 */