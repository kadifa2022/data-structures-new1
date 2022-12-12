package com.cydeo.algoQuestions;

import java.util.Arrays;

public class MissingNumber {


    static int MissingNumber(int[] nums){
        int lenArr=nums.length;// [0,1,2]
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i-nums[i] !=0){
                return i;
            }//complexity n log(n)

        }
        return nums.length;
    }
    //another solution TC O(n) SC O(1)
     static int withMath(int [] nums){
        int n = nums.length;
        int expected = n * ( n + 1 ) / 2;
        int actual = 0;
        for(int num : nums){
            actual +=num;
        }
        return expected - actual;
    }


}
