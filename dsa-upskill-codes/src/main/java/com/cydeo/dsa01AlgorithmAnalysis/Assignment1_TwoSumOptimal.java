package com.cydeo.dsa01AlgorithmAnalysis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assignment1_TwoSumOptimal {

    public static void main(String[] args) {


        int[] array = new int[]{4,7,2,11};
        System.out.println(Arrays.toString(twoSumOptimalSolution(array,9)));


    }

    public static int [] twoSumOptimalSolution(int[] array, int targetValue){
        //create hashMap
        Map<Integer, Integer > map = new HashMap<>();
        for (int i = 0; i <array.length ; i++) {
            int potentialMath= targetValue-array[i];
            if(map.containsKey(potentialMath)) return new int []{i,map.get(potentialMath)};
             else map.put(array[i], i);
        }
        return new int[] {};// otherwise will return empty
    }

}
