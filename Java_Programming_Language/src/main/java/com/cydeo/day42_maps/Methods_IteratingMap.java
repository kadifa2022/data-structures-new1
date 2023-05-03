package com.cydeo.day42_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Methods_IteratingMap { //Iteration key and values // entries pairs

    public static void main(String[] args) {// keySet()/can't be duplicate


        Map<String, Integer> map  = new LinkedHashMap<>();
        map.put("Daniel ", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 7800);
        map.put("Jimmy", 120000);
        map.put("Aaron", 85000);
        map.put("Breanna", 100000);
        System.out.println(map);

        // Iterating map by keys
        for (String eachKey:map.keySet()) {
            //System.out.println(eachKey);
            // replace all value
           // map.replace(eachKey, map.get(eachKey) *2); // to double the salary of each employee

            System.out.println(eachKey);

        }

        System.out.println("LinkedHashMap " + map);


        System.out.println("------------------------------------------------");
            // Iterating eachValue
        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);

        }

        System.out.println("------------------------------------------");

        // key and value// first get entry
         // Interface inside Map is called EntryInterface
//     for( Map.Entry<String, Integer> eachEntry  : map.entrySet()){
//         System.out.println(eachEntry);
//     }

        for (Map.Entry<String, Integer> eachEntry: map.entrySet()) {
            System.out.println(eachEntry);

        }

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue =  eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000);
            System.out.println(eachKey + " : " +eachValue);

        }
        System.out.println(map);











    }
}
