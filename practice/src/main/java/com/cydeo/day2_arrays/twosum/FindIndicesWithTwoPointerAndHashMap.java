package com.cydeo.day2_arrays.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindIndicesWithTwoPointerAndHashMap {

    public static void main(String[] args) {

    }

    public static int[] findIndicesWithTwoPinterAndHashMap(int[] arr, int target){
        int left =0, right = arr.length-1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {//n
            map.put(arr[i], i);
            Arrays.sort(arr);//n log(n)
            while(left < right){ //n
                if (arr[left] + arr[right]==target) {
                    return new int[]{map.get(arr[left]), map.get(arr[right])};
                } else if (arr[left] + arr[right]< target) {
                   left++;
                }else
                    right--;
                }

        }
        return new int[0];
    }
}
