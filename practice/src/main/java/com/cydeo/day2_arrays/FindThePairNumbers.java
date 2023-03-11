package com.cydeo.day2_arrays;

import com.cydeo.day2_arrays.Array;

import java.util.Arrays;

public class FindThePairNumbers {

    public static void main(String[] args) {
       int[] arr = {16, 3, 11, 5, 15};

        System.out.println(Arrays.toString(findThePairNumbers(arr, 14)));

    }
    public static int[]findThePairNumbers(int[]arr, int target){
        int left=0, right=arr.length-1;
        Arrays.sort(arr);

        while(left<right){
            if(arr[left] + arr[right]==target)
                return  new int[]{arr[left], arr[right]};
            else if (arr[left] + arr[right]< target){
                left++;
            }else
            right--;
        }
        return new int[0];

    }


}
/*
Given an array of integers nums and an integer target, return the two numbers such that they add up to target.
⮚ Assume that each input would have exactly one solution, and you should not use the same element twice.
⮚ You can return the answer in any order.
⮚ No solution will return empty array.
⮚ Please, use two pointer strategy which you learned at DSA session to solve this problem (Hint : you should sort the input first).
⮚ EXAMPLE:
Input: nums = [16, 3, 11, 5, 15], target = 8
Output: [3, 5]
Explanation: Because nums[1] + nums[3] => 3 + 5 = 8, we return [3, 5].
⮚ Optional additional task : Try to return original indices of the pair numbers


Two Pointer Strategy
We can use Two pointer strategy in two different ways:
1. One slow-runner and the other fast-runner.
2. One pointer starts from the beginning while the other pointer starts from the end.
 */