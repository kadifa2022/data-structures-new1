package com.cydeo.algoQuestions;

import java.util.*;

public class Array_FrequencyOfEachElement {

    public static void main(String[] args) {
        String[] testArray ={"Apple", "Banana", "Apple", "Cherry"};

        Map<String, Integer> map = new LinkedHashMap<>();
        for(String each: testArray){
            int frequency =0;
            for(String str : testArray){
                if (each.equals(str)) {
                    frequency++;
                }
            }
            map.put(each, frequency);
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry);
        }

        System.out.println(" ------------------Second Solution ------------------ ");

        List<String> temp = Arrays.asList(testArray);
        for(String str : new LinkedHashSet<>(temp)){
            System.out.println(str+ "=" + Collections.frequency(temp, str));
        }
    }
}
/*
         Given the array return the output
         testArray = {"Apple","Banana","Apple","Cherry"}
         Output Example
         Apple = 2
         Banana = 1
         Cherry = 1
         */