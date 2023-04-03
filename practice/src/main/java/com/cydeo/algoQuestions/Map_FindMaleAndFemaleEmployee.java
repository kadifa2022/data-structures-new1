package com.cydeo.algoQuestions;

import java.util.HashMap;
import java.util.Map;

public class Map_FindMaleAndFemaleEmployee {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Sandy", "F");
        employeeMap.put("Mina", "F");
        employeeMap.put("Tina", "F");
        employeeMap.put("Mujo", "M");
        employeeMap.put("Ahmed", "M");
        employeeMap.put("Safet", "M");
        employeeMap.put("Ilfan", "M");
        employeeMap.put("Nedin", "M");
        employeeMap.put("Asima", "F");
        employeeMap.put("Asim", "M");


        //How many female and male employees in the map?

        int countMaleEmployees = 0;
        int countFemaleEmployees = 0;

        for (String eachValue : employeeMap.values()){
            if(eachValue.equals("F")){
                countFemaleEmployees++;
            }else{
                countMaleEmployees++;

            }
        }
        System.out.println("Male employees:" + countMaleEmployees);
        System.out.println("Female employees:"+ countFemaleEmployees);


        System.out.println("--------Display all names of female employees-------");
        //Another solution

        for(Map.Entry<String, String> eachEntry :employeeMap.entrySet()){
            if (eachEntry.getValue().equals("F")) {

                System.out.println(eachEntry.getKey());
            }
        }























    }
}