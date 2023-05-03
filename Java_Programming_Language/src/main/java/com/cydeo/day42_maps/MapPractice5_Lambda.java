package com.cydeo.day42_maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice5_Lambda {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        // key and value is one entry
        map.put("A001", "Mustafa");
        map.put("A002", "Nora");
        map.put("A003", "Tatiana");
        map.put("A004", "Mustafa");
        map.put("A005", "Nora");
        // forEach() and lambda expression

        map.forEach((k,v) -> { System.out.println(k + " : " + v);});




    }
}
