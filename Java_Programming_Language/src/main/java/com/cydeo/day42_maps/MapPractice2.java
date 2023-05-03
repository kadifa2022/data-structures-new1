package com.cydeo.day42_maps;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();

        person1.put("name", "Artur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000);
        person1.put("hire_date", LocalDate.of(2012,1,15));
        person1.put("married", true);



        Map<String, Object> person2= new LinkedHashMap<>();

        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Back-EndDeveloper");
        person2.put("salary", 90000);
        person2.put("hire_date", LocalDate.of(2019,4,10));
        person2.put("married", true);

        System.out.println(person2.get("name"));
        System.out.println(person2.get("age"));

        Map<String, Object> person3= new LinkedHashMap<>();
        person3.put("name", "Milka");
        person3.put("gender", 'F');
        person3.put("age", 34);
        person3.put("job_title", "Back-EndDeveloper");
        person3.put("salary", 90000);
        person3.put("hire_date", LocalDate.of(2022,4,10));
        person3.put("married", true);



        Map<String, Object> person4= new LinkedHashMap<>();
        person4.put("name", "Fatma");
        person4.put("gender", 'F');
        person4.put("age", 20);
        person4.put("job_title", "Back-EndDeveloper");
        person4.put("salary", 90000);
        person4.put("hire_date", LocalDate.of(2022,4,10));
        person4.put("married", true);




        Map<String, Object> person5= new LinkedHashMap<>();
        person5.put("name", "Tina");
        person5.put("gender", 'F');
        person5.put("age", 19);
        person5.put("job_title", "Back-EndDeveloper");
        person5.put("salary", 90000);
        person5.put("hire_date", LocalDate.of(2021,4,10));
        person5.put("married", true);


        // list of map
        List<Map<String, Object>> listOfMap = new ArrayList<>();// accepts map objects
        listOfMap.add(person1);// added single map with add()
        listOfMap.add(person2);
        listOfMap.add(person3);
        listOfMap.add(person4);
        listOfMap.add(person5);



       // listOfMap.addAll(Arrays.asList(person3, person4, person5));// added multiple maps with addAll()and Arrays.asList()
        System.out.println(listOfMap);

        for (Map<String, Object> eachMap:listOfMap) {
            System.out.println(eachMap);

            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);

            }
        }

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::;");

        //display all names of the employee who are hired 2022

        for(Map<String, Object> eachMap:listOfMap){//first iterate List of maps to get each employee
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {//to get eachEntry
                if(eachEntry.getKey().equals("hire_date")){
                    //local date is cast
                    if( ((LocalDate)eachEntry.getValue() ).getYear() == 2022){
                        System.out.println(eachMap.get("name"));//

                    }

                }
            }
        }

        System.out.println("------------------------------------------------------------");
        //to get first map
        listOfMap.get(0).replace("name", "Vasyl");          //cast to integer(because is reference type object) and the add to salary +50000

        listOfMap.get(listOfMap.size()-1).replace("salary", ((Integer) listOfMap.get(listOfMap.size()-1).get("salary")) + 50000);

        listOfMap.get(1).replace("age", ((Integer)listOfMap.get(1).get("age")) + 4);

        System.out.println(listOfMap);

        System.out.println("-------------------------------------------------");
        // to keep everything in order we are using LinkedHashMap

        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2021);
        car1.put("color","Red");
        car1.put("price", 45000.5);


        Map<String, Object> car2 = new LinkedHashMap<>();
        car2.put("brand", "Mercedes");
        car2.put("model", "X5");
        car2.put("year", 2020);
        car2.put("color","Blue");
        car2.put("price", 55000.5);

        Map<String, Object> car3 = new LinkedHashMap<>();
        car3.put("brand", "Audi");
        car3.put("model", "X5");
        car3.put("year", 2020);
        car3.put("color","White");
        car3.put("price", 55000.5);

        Map<String, Object> car4 = new LinkedHashMap<>();
        car4.put("brand", "Honda ");
        car4.put("model", "cvs");
        car4.put("year", 2020);
        car4.put("color","Black");
        car4.put("price", 55000.5);

        List<Map<String, Object>> carList = new ArrayList<>();

        carList.addAll(Arrays.asList(car1, car2, car3, car4));



























    }
}
