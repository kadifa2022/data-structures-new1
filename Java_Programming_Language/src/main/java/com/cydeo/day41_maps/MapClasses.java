package com.cydeo.day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //Random order// accepts null key and null values
            // Key    value
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Daniel ", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        // map1.put("Daniel ", 75000);// last one will be printed because key can't be duplicated
        hashMap.put("Arron", 7800);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 85000);
        hashMap.put(null, 100000);

        System.out.println("HashMap "+ hashMap);


        // LinkedHashMap:
        // Keeps insertion order//accepts null value as a key(key can't be duplicate)
        // values can be duplicate
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Daniel ", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);

        linkedHashMap.put("Arron", 7800);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 85000);
        linkedHashMap.put(null, 100000);


        System.out.println("LinkedHashMap " + linkedHashMap);

        //TreeMap:
        //Maintain the sorted(Ascending) order A-Z 1-9// no null key but allows null values
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Daniel ", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);

        treeMap.put("Arron", 7800);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null);
//        treeMap.put(null, 120000);// key can't be null in tree map, value can be null
//        treeMap.put(null, 85000);
//        treeMap.put(null, 100000);

        System.out.println("TreeMap " + treeMap);
        //HashTable:
        // MaintainsRandom order// do not accepted null as key
        // Synchronized(threat save in multiple threading ->one thread at the time)
        // value and the key can't  be null

        Map<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("Daniel ", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);

        hashtable.put("Arron", 7800);
        //hashtable.put("Chris", null); value can't be null
        // hashtable.put("Breanna", null);
        //hashtable.put(null, 120000);// key can't  be null
        //hashtable.put(null, 85000);

        try {
            hashtable.put("Diana", 100000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Hash Table " + hashtable);



    }
}
/*

Daniel = 95000$
Emily = 1000000$
Bella = 850000$

 */