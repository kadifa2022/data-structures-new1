package com.cydeo.day2_arrays.frequencyAndConvertingToWord;

import java.util.HashMap;
import java.util.Map;

public class WithEnumAndMap {
    public static void main(String[] args) {



    }

    static void withEnumAndMap(int[] arr){
        if(arr==null || arr.length ==0){
            System.out.println("array is empty");
            return;
        }
        Map<Integer, Integer> map=new HashMap<>();
        for(int each : arr) {
            map.put(each, map.getOrDefault(each,0)+1);
        }
        map.forEach((k,v) ->{
            int n = v <= 11 ? v: 11;
            System.out.println(k + " is " + NumberToWord.values()[n].value);
        });
    }
}
