package javaInterviewCodingQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Object> car1 = new LinkedHashMap<>();

            car1.put("brand", "BMW");
            car1.put("model", "X5");
            car1.put("body", "SUV");
            car1.put("year", 2021);// autoboxing
            car1.put("auto", true);// autoboxing
            car1.put("price", 45000); // autoboxing
        System.out.println(car1.size());
        System.out.println(car1);

        car1.put("price", 55000);// replace existing value with new value
        System.out.println(car1);

        System.out.println(car1.get("brand")+" : " + car1.get("model"));

        System.out.println("----iterate with the values ----------------------------");

        for (Object value : car1.values()) {
            System.out.println(value);
        }
        System.out.println(" iterate by the keys--------");

        for (String key : car1.keySet()) {
            System.out.println(key);

        }
        System.out.println("Iterate by the entry set");

        for (Map.Entry<String, Object> entry : car1.entrySet()) {
            //System.out.println(entry);
           // System.out.println(entry.getValue() + " : " + entry.getKey());
            if(entry.getKey().equals("year")){// "price"
                entry.setValue(2019);//50000
            }
        }
        System.out.println(car1);

        System.out.println(" -------Car -Task-------------");

        Map<String, Object> car2 = new LinkedHashMap<>(); // to keep the same order

        car2.put("brand", "Audi");
        car2.put("model", "X5");
        car2.put("color", "White");
        car2.put("year", 2021);// autoboxing
        car2.put("electric", false);// autoboxing
        car2.put("price", 30000); // autoboxing

        Map<String, Object> car3 = new LinkedHashMap<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model y");
        car3.put("color", "Red");
        car3.put("year", 2024);// autoboxing
        car3.put("electric", true);// autoboxing
        car3.put("price", 60000); // autoboxing

        System.out.println(" Map of the Map ");
        Map<Integer, Map<String, Object>> cars = new LinkedHashMap<>();
        cars.put(1, car1);
        cars.put(2, car2);
        cars.put(3, car3);

        System.out.println(cars);
        cars.get(2).replace("year", 2018);
        cars.get(2).replace("price", 40000);

        System.out.println(cars);

        for (Map.Entry<Integer, Map<String, Object>> entry : cars.entrySet()) {
          //  System.out.println(entry);
            for (Map.Entry<String, Object> entry2 : entry.getValue().entrySet()) {
                if(entry2.getKey().equals("price")){
                    entry2.setValue((Integer)entry2.getValue() * 1.1);
                }
            }
        }
      System.out.println(cars);


    }
}
