package com.cydeo.dsa02CollectionsReview;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInString {

    public static void main(String[] args) {

        // create hashMap
        Map<Integer, String> studentsMap= new HashMap<>();
        studentsMap.put(1,"Jack");
        studentsMap.put(2, "Julia");
        String str = "JJavvaJaddeVeloPPeeer";

        System.out.println(findFirsNonRepeating(str));
    }

    public static  Character findFirsNonRepeating(String str){
        // create a map: this will cost me space complexity o(n)
        Map<Character, Integer> map = new HashMap<>();
        int count;
        // count the frequency of chars
        for(Character ch: str.toCharArray()){
            if(map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch, count +1);
            }
            else map.put(ch, 1);
        }
        //start from beginning and check if there is a char with frequency 1
        for(Character ch: str.toCharArray()){
            if(map.get(ch)==1) return ch;
        }
        return null;
    }
}
