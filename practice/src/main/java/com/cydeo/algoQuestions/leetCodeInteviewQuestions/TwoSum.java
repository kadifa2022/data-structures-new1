package com.cydeo.algoQuestions.leetCodeInteviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {8, 7, 2, 5, 3, 1};
        int target = 10;


    }

    public static int[] twoSum(int [] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        //in case there is no solution we will just return null;
        return null;
     }
}
