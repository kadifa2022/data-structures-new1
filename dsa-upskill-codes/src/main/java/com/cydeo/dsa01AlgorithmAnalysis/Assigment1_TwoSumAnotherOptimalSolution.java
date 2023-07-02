package com.cydeo.dsa01AlgorithmAnalysis;

import java.util.Arrays;

public class Assigment1_TwoSumAnotherOptimalSolution {
// this is not good solution// this solution works with sorted arrays
    public static void main(String[] args) {
        int[] nums= {2,7,11,15};
        int target = 9;
        int[] ind= new int [2];
        // sort method here (n logn)

        for (int i = 0, j = 1; i < nums.length; i++,j++) {
            if(nums[i]> target){continue;}
            if(target-nums[i]==nums[j]){
                ind[0]=i; ind[1]=j;

                System.out.println(Arrays.toString(ind));
            }

        }
    }
}
