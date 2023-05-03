package com.cydeo.day42_maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice4_MapOfMap {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();

        person1.put("name", "Artur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("hire_date", LocalDate.of(2012, 1, 15));
        person1.put("married", true);


        Map<String, Object> person2 = new LinkedHashMap<>();

        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-EndDeveloper");
        person2.put("salary", 90000);
        person2.put("hire_date", LocalDate.of(2019, 4, 10));
        person2.put("married", true);

//        System.out.println(person2.get("name"));
//        System.out.println(person2.get("age"));

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Milka");
        person3.put("gender", 'F');
        person3.put("age", 34);
        person3.put("job_title", "Back-EndDeveloper");
        person3.put("salary", 90000);
        person3.put("hire_date", LocalDate.of(2022, 4, 10));
        person3.put("married", true);


        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Fatma");
        person4.put("gender", 'F');
        person4.put("age", 20);
        person4.put("job_title", "Back-EndDeveloper");
        person4.put("salary", 90000);
        person4.put("hire_date", LocalDate.of(2022, 4, 10));
        person4.put("married", true);


        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Tina");
        person5.put("gender", 'F');
        person5.put("age", 19);
        person5.put("job_title", "Back-EndDeveloper");
        person5.put("salary", 90000);
        person5.put("hire_date", LocalDate.of(2021, 4, 10));
        person5.put("married", true);

        Map<Integer, Map<String, Object>> mapOfMaps = new LinkedHashMap<>();// IN Map storing maps
       // providing key dor each map
        mapOfMaps.put(0, person1);
        mapOfMaps.put(1, person2);
        mapOfMaps.put(2, person3);
        mapOfMaps.put(3, person4);
        mapOfMaps.put(4, person5);

        System.out.println(mapOfMaps);

        mapOfMaps.get(1).replace("salary", 120000);

        System.out.println( mapOfMaps.get(1) );


        System.out.println("------------------------------------------------------------------------");


        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {
                if(eachEntry.getKey().equals("salary")){
                    eachEntry.setValue((Integer)eachEntry.getValue()+10000);
                }

            }

        }
        System.out.println(mapOfMaps);

       // Map<Map<String, Integer>, Map<String, Integer>> mapMapMap = new LinkedHashMap<>();//avoid to create map of another 2 maps (memory usage) but is possible

    }
}
