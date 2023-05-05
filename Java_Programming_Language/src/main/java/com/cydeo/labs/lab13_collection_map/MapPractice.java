package com.cydeo.labs.lab13_collection_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Object> car1 = new LinkedHashMap<>();// in order
        car1.put("brand", "BMD");
        car1.put("model", "X5");
        car1.put("body", "SUV");
        car1.put("year", 2021);//implicitly -> primitive converted to integer wrapper class
        car1.put("auto", true);// autoboxing primitive converted to boolean wrapper class
        car1.put("price", 45000); // autoboxing  -> primitive converted to integer wrapper class

        System.out.println(car1.size());
        System.out.println(car1);
        // update price to 55000
        car1.put("price", 55000);// replacing price with the new value
        System.out.println(car1.get("brand") + " : " + car1.get("model"));

        System.out.println("------------------------iterating map by -value()------------------------------");
        for (Object value : car1.values()) {
            System.out.println(value);
        }
        //value has set()
        System.out.println("------------------------iterating map by keySet()------------------------------");
        for (String key : car1.keySet()) {
            System.out.println(key);

        }
        //key does not have set()

        System.out.println("-----------------------iterating map by entry (key and value)------------------");
        for (Map.Entry<String, Object> entry : car1.entrySet()) {
            // System.out.println(entry);
            //  System.out.println(entry.getValue()+ " : "+ entry.getKey());

            if (entry.getKey().equals("year")) {
                entry.setValue(2019);
            }
            if (entry.getKey().equals("price")) {
                entry.setValue(50000);
            }

        }
        System.out.println(car1);

        System.out.println("-------------------------------------------------");


        Map<String, Object> car2 = new LinkedHashMap<>();// in order
        car2.put("brand", "Audi");
        car2.put("model", "q7");
        car2.put("color", "gray");
        car2.put("year", 2021);//implicitly -> primitive converted to integer wrapper class
        car2.put("electric", false);// autoboxing primitive converted to boolean wrapper class
        car2.put("price", 50000);


        Map<String, Object> car3 = new LinkedHashMap<>();// in order
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("body", "White");
        car3.put("year", 2021);//implicitly -> primitive converted to integer wrapper class
        car3.put("electric ", true);// autoboxing primitive converted to boolean wrapper class
        car3.put("price", 60000);

        System.out.println("-----------------------------------------------------------");

        Map<Integer , Map <String, Object>> cars = new LinkedHashMap();
        cars.put(1, car1);
        cars.put(2, car2);
        cars.put(3, car3);
        System.out.println(cars);

        cars.get(2).replace("year", 2018);
        cars.get(2).replace("price", 12000);
        System.out.println(cars);
                    //     k,        v
        for (Map.Entry<Integer, Map<String, Object>> entry : cars.entrySet()) {// entry -s
            for (Map.Entry<String, Object> entry2 : entry.getValue().entrySet()) {// each entry of inner map
                System.out.println(entry2);
                if(entry2.getKey().equals("price")){
                    entry2.setValue((Integer)entry2.getValue()* 1.1); // cast to Integer
                }

            }

        }





    }

}