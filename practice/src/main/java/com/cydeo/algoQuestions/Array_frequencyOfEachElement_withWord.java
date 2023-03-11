package com.cydeo.algoQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Array_frequencyOfEachElement_withWord {

    public static void main(String[] args) {
        int [] array = {1,2,2,2,2,3,3,3,3,4,4,5,5,6,6,7,8,7,10,11,0};
        String [] words = {"zero", "one", "two", "three","four","five", "six", "seven", "eight", "nine", "ten", "more than ten"};

        Map<Integer, String> map = new LinkedHashMap<>();
        for(int each :array){
            int count = 0;
            for(int n :array){
                if(each == n){
                    count++;
                }
            }
            if(count>10){
                map.put(each, words[11]);
            }else{
                map.put(each, words[count]);
            }
        }
        map.forEach((k,v)-> System.out.println(k+ " is " + v));

    }
}
/*
    int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};
    write a
    program that should count each number and prints a sentence to say how many times a number is repeated example: 1 is two,
        3 is three,
        4 is two.
        2 is five */