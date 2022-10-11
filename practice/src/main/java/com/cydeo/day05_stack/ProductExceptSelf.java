package com.cydeo.day05_stack;

public class ProductExceptSelf {
    public static void main(String[] args) {


    }


    public static int[] productExceptSelf(int[] num) {

        int[] left = new int[num.length];
        int[] right = new int[num.length];
        int[] result = new int[num.length];

        left[0] = 1;
        right[num.length - 1] = 1;

        for (int i = 1; i < num.length; i++) {
            left[i] = left[i - 1] * num[i - 1];
            right[num.length - i - 1] = right[num.length - i] * num[num.length - i];
        }
        for (int i = 0; i < num.length; i++) {
            result[i] = left[i] * right[i];
            return result;

        }
      return result;

    }
}

/*
 Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
• The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
• You must write an algorithm that runs in O(n) time and without using the division operation.

  Ex.1
  Input: nums=[1,2,3,4]
  Output: [24,12,8,6]
  Ex.2
  Input: nums=[-1,1,0,-3,3]
  Output: [0,0,9,0,0]

 */