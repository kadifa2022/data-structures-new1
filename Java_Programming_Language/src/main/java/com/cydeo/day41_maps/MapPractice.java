package com.cydeo.day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        // create map
        Map<String, Object> person1 = new LinkedHashMap<>(); // keep order of key and value
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title","Developer");
        person1.put("salary", 100000.5);
        person1.put("married", true);

        System.out.println( person1.get("name"));
        System.out.println(person1.get("salary"));
        System.out.println(person1.get("job_title"));

        System.out.println(person1.size());


        System.out.println(person1);

    }
}
