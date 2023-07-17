package co.cydeo.lab12_array_collection_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("body", "SUV");
        car1.put("year" , 2021);// primitive converted to object autoboxing
        car1.put("auto" , true);// autoboxing
        car1.put("price", 45000); // autoboxing

        System.out.println((car1.size()));
        System.out.println(car1);
        car1.put("price" , 55000);
        System.out.println(car1);

        System.out.println(car1.get("brand") + ": " + car1.get("model"));

        System.out.println(" ---------Iterating map by Values----------------");
        for (Object value: car1.values()) {
            System.out.println(value);

        }
        System.out.println("--------Iterating map by Key--------");

        for (Object key: car1.keySet()) {
            System.out.println(key);
        }
        System.out.println("--------Iterating map by EntrySet--------");

       // for (Object entry: car1.entrySet()) {
        for (Map.Entry<String, Object> entry: car1.entrySet()) {
           // System.out.println(entry.getValue() + ": " + entry.getKey());
            if(entry.getKey().equals("year")){// using the setter to set the value
                entry.setValue(2019);
            }
            if(entry.getKey().equals("price")){
                entry.setValue("60000");

            }

            System.out.println(car1);

        }

        System.out.println("-----------------");


        Map<String, Object> car2 = new LinkedHashMap<>();
        car2.put("brand", "Audi");
        car2.put("model", "X5");
        car2.put("body", "SUV");
        car2.put("year" , 2021);// primitive converted to object autoboxing
        car2.put("auto" , true);// autoboxing
        car2.put("price", 45000); // autoboxing



        Map<String, Object> car3 = new LinkedHashMap<>();
        car3.put("brand", "Tesla");
        car3.put("model", "X5");
        car3.put("body", "SUV");
        car3.put("year" , 2021);// primitive converted to object autoboxing
        car3.put("auto" , true);// autoboxing
        car3.put("price", 45000); // autoboxing

        System.out.println("--------------------------------------------");

        Map<Integer, Map<String, Object>> cars = new LinkedHashMap<>();
        cars.put(1, car1);
        cars.put(2, car2);
        cars.put(3, car3);
        System.out.println(cars);

        cars.get(2).replace("year", 2018);
        cars.get(2).replace("price",  4000);
        System.out.println(cars);
        System.out.println("------------------------------------");
        for (Map.Entry<Integer, Map<String, Object>> entry : cars.entrySet()) {// Map of the map
            for (Map.Entry<String, Object> entry2 : entry.getValue().entrySet()) {
                if(entry2.getKey().equals("price")){
                    entry2.setValue( (Integer)entry2.getValue() * 1.1 );// cast to Integer

                }
            }
        }
        System.out.println(cars);

    }
}