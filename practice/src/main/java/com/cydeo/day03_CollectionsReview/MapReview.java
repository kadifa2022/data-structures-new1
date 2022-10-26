package com.cydeo.day03_CollectionsReview;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;

public class MapReview {
    public static void main(String[] args) {
        //create HashMap
        Map<Integer, String> studentsMap= new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");
        String st="JJavvaDDevellopperr";
        System.out.println(findFirstNonRepeating(st));

    }
    public static Character findFirstNonRepeating(String str){
        //create a map:this will cost me space complexity 0 (n)
        Map<Character, Integer> map = new TreeMap<>();
        int count;
        //count the frequency of chars
        for (Character ch: str.toCharArray()) {
            if(map.containsKey(ch)){
                count=map.get(ch);
                map.put(ch, count +1);

            }
            else map.put(ch, 1);

        }
        //start from beginning and check if there is a char with frequency 1
      {
          for (Character ch: str.toCharArray()) {
              if(map.get(ch)==1) return ch;
          }
          }

     return null;

    }
}
