package com.cydeo.algoQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class getPairsWithHashMap {
    static Map<String, Integer> getPairs(List<String> animals) {
        Map<String, Integer> pairs = new java.util.HashMap<>();
        for(String animal:animals){
            int num =  pairs.getOrDefault(animal, 0);
            if(num<2){
                pairs.put(animal, ++num);
            }
        }
        pairs.entrySet().removeIf(e->e.getValue()==1);
        return pairs;


    }

    public static void main(String[] args) {
        List<String> animals= new ArrayList<>();
        animals.add("cat");
        animals.add("dog");


        System.out.println(getPairsWithHashMap.getPairs(animals));
    }
}