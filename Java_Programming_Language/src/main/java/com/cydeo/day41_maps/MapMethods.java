package com.cydeo.day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

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


        System.out.println(map.size());//
        System.out.println(map);

        System.out.println(map.get("A003"));

        map.put("A003", "Lucy");// update value of existing key
        map.put("A007", "Muhamed");// can be done with replace()
        System.out.println(map);

        System.out.println(map.get("A001"));// get() specified key

        map.replace("A005", "Tatiana");// replacing with new value
        map.replace("A006", "Malika");

        map.remove("A007");// removed and map decreased

        System.out.println(map);
        System.out.println( map.containsKey("A003"));// true
        System.out.println(map.containsKey("H90")); //false

        System.out.println(map.containsValue("Kadifa"));// false is specifies key exist in map
        System.out.println(map.containsValue("Lucy")); //true


        System.out.println(map.isEmpty());//returns  false , because is not empty

        System.out.println(map.equals(map));// compare

          map.clear();
        System.out.println(map);





    }
}
