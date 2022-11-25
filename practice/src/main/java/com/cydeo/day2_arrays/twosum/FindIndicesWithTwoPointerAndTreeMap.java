package com.cydeo.day2_arrays.twosum;

import java.util.TreeMap;

public class FindIndicesWithTwoPointerAndTreeMap {

    public static void main(String[] args) {

    }

    public static int[] findIndicesWithTwoPointerAndTreeMap(int[] arr, int target) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {

        }
        while(!map.firstKey().equals(map.lastKey())){
            if(map.firstKey() + map.lastKey() == target){
                return new int[]{map.firstEntry().getValue(), map.lastEntry().getValue()};
            }else if(map.firstKey() + map.lastKey()< target){
                map.remove(map.firstKey());
            }else
                map.remove(map.lastKey());
        }
        return new int[0];
    }
}