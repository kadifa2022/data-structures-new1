package com.cydeo.day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods2 {
    public static void main(String[] args) {


        Map<String, String> map = new TreeMap<>();
        // key and value is one entry
        map.put("A001", "Mustafa");
        map.put("A002", "Nora");
        map.put("A003", "Tatiana");
        map.put("A004", "Mustafa");
        map.put("A005", "Nora");
        map.put("A006", "Tatiana");
        map.put("A007", "Abidulah");

       // putAll()

        Map<String, String > employees = new TreeMap<>();// SORTED ORDER
        employees.putAll(map);
        System.out.println(employees);

        System.out.println(map == employees);// TWO DIFFERENT MEMORY LOCATIONS in heap outside string pool

        System.out.println(map.equals(employees));// to compare key/values use equals ()


    }
}