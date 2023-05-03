package com.cydeo.day42_maps;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3_Array {
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

        System.out.println(person2.get("name"));
        System.out.println(person2.get("age"));

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

        Map<String, Object> [] arrayOfMap = new Map[5];//0-4
        arrayOfMap[0]=person1;
        arrayOfMap[1]=person2;
        arrayOfMap[2]=person3;
        arrayOfMap[3]=person4;
        arrayOfMap[4]=person5;
      //   arrayOfMap[5] = new LinkedHashMap<>(); Can't be added /array size is fixed
        //cast to integer(because is reference type object) and the add to salary +20000

        arrayOfMap[1].replace("salary", ((Integer)arrayOfMap[1].get("salary"))+  20000);
        arrayOfMap[0].replace("name", "Hasan");

        System.out.println(Arrays.toString(arrayOfMap));

        System.out.println("----------------------------------------");
        // find how many employee is making <10000

        int count=0;

        for (Map<String, Object> eachMap : arrayOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("salary")){
                    double salary = (Integer)eachEntry.getValue();// one solution ->object salary cast to integer
                    if(salary<100000){
                        count++;
                    // second solution
                   // if((Integer)eachEntry.getValue()<10000){// need to cast to integer because is object
                    //    count++;
                    }
                }
            }
        }

        System.out.println(count);




    }
}