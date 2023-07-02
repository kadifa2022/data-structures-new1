package com.cydeo.dsa02CollectionsReview;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1,"Jack");
        studentsMap.put(2, "Julia");
        studentsMap.put(3,"Alison");

        String str = "jjAVAdEVELOPER";
        System.out.println(findFirstNonRepeating(str));


    }

    public static Character findFirstNonRepeating(String str){

        //create map: will cost me space complexity using another ds O(N)
        Map<Character, Integer> map = new TreeMap<>();
        int count;//FREQUENCY
        //count the frequency of chars(for each loop)
        for (Character ch:str.toCharArray()) {//cont characters/ turning in to char array
            if(map.containsKey(ch)){// if the map   character is not in the list
                count = map.get(ch);// getting characters and adding to the list
                map.put(ch, count +1);// increasing by 1 and put in the map key is the character value us count
            }
            else map.put(ch,1);
        }
        
        //start from the beginning and check if there is a char frequency 1
        for (Character ch:str.toCharArray()) {
            if(map.get(ch)==1) return ch;
            
        }



        return null;
    }


}
