package com.cydeo.map;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Integer> empIds = new HashMap<>();//  key and value pair-no guaranty order
        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 867432);

        System.out.println(empIds);
        System.out.println(empIds.get("John"));
        System.out.println(empIds.containsKey("George"));
        System.out.println(empIds.containsValue(12345));
        empIds.put("John", 3246);
        System.out.println(empIds);
        empIds.replace("Kramer", 777);
        System.out.println(empIds);
        empIds.putIfAbsent("Steve", 2333);
        System.out.println(empIds);
        empIds.remove("John");
        System.out.println(empIds);

    }
}
