package com.cydeo.day2_arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Assigment_TwoSumOptimal {
    public static void main(String[] args) {
        int [] array=new int[]{2,7,9,11};
        System.out.println(Arrays.toString(twoSumOptimalSolution(array,11)));

    }
    public static int[] twoSumOptimalSolution(int [] array, int targetValue){
        //complexity of the solution is 0(n)
        //create hashMap
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int potentialMatch=targetValue-array[i];
            if (map.containsKey(potentialMatch))
                return new int[]{i,map.get(potentialMatch)};
            else map.put(array[i], i);

        }
        return new int []{};
    }
    public static int[] twoSumOptimalSolution1(int[] array, int targetValue){
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < array.length ; i++) {
            int potentialMatch=targetValue-array[i];
            if(map.containsKey(potentialMatch))return new int[] {i,map.get(potentialMatch)};
            else map.put(array[i], i);

        }
        return new int[]{};
    }

}
