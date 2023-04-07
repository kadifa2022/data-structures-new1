package com.cydeo.algoQuestions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map_SortMapByValues {



    public static Map<String, Integer> sortByValues(Map<String, Integer> map){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> each:list){
            map.put(each.getKey(), each.getValue());
        }
        return map;

    }

}
 /*
    Write a method that can sort the map by values
    */