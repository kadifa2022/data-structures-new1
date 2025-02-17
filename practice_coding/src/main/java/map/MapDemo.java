package map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {



        Map<Integer, String> hashMap= new HashMap<>();
        hashMap.put (10, "Arthur");
        hashMap.put (20, "Antony");
        hashMap.put (30, "Lion");
        hashMap.put (40, "Nelly");
        hashMap.put (50, "John");
        hashMap.put (0, "Hanna");
        hashMap.put (null, "Null");

        System.out.println("HashMap:" + hashMap);


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put (10, "Arthur");
        linkedHashMap.put (20, "Antony");
        linkedHashMap.put (30, "Lion");
        linkedHashMap.put (40, "Nelly");
        linkedHashMap.put (50, "John");
        linkedHashMap.put (0, "Hanna");
        linkedHashMap.put (null, "Null");
        System.out.println("Linked hash map" + linkedHashMap);


        Map<Integer, String> hashTable = new Hashtable<>();
        hashTable.put (10, "Arthur");
        hashTable.put (20, "Antony");
        hashTable.put (30, "Lion");
        hashTable.put (40, "Nelly");
        hashTable.put (50, "John");
        hashTable.put (0, "Hanna");
//        hashTable.put (null, "Null");
        System.out.println("HashTable "+ hashTable);

        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put (10, "Arthur");
        treeMap.put (20, "Antony");
        treeMap.put (30, "Lion");
        treeMap.put (40, "Nelly");
        treeMap.put (50, "John");
        treeMap.put (0, "Hanna");
       // treeMap.put (null, "Null");
        System.out.println("Tree map "+ treeMap);


    }
}
