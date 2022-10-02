package com.cydeo.day2_arrays;

import java.util.Arrays;

public class AnotherOptimal {
    public static void main(String[] args) {

        int[] nums = {17, 2, 3, 4, 7, 9, 15, 16};//needs t o be sorted
        int target = 9;
        int[] ind = new int[2];
        //sort methode here nlong

        for (int i = 0, j = 1; i < nums.length; i++, j++) {//0(n)
            if (nums[i] > target) {
                continue;}
                if (target - nums[i] == nums[j]) {
                    ind[0] = i;
                    ind[1] = j;
                    System.out.println(Arrays.toString(ind));
                }

            }


        }

    }