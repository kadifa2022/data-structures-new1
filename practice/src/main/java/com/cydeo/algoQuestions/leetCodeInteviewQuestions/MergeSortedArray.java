package com.cydeo.algoQuestions.leetCodeInteviewQuestions;

import com.cydeo.mosh.Array;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
// need to be fixed
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        System.out.println(Arrays.toString(merge(num1, 3, num2, 3)));


    }







    public static int [] merge( int[] num1,int m, int [] num2, int n){
        // two pointers
        int p1 = m-1, p2 = n-1, i = m+n -1;
        while(p2 >=0){
            if(p1 >=0 && num1[p1] >= num2[p2]){
                num1[i--] = num1[p1--];
            }else{
                num1[i--] = num2[p2--];
            }
        }
        return num1;


    }
}
/*
The logic is written using the Two-Pointer Approach
Basically the main logic behind this approach is to start
filling the from the largest element at the back of the array given to us.
Initially p1 = m-1 , p2 = n-1 , i = m+n-1
So lets takes two pointers that mark the end of 2 arrays and i ,that would be the index at which we are going to write the value , now we will compare the values at p1 and p2 and write the value that is larger at index i , after writing we decrement the respective indexes .
And the another edge case is that if any one of the array is empty arr[i] = [0] , index i-1 and another one is arr[j] = [1,2,3] , index = j-1
So if we consider the index as i-1 then it becomes negative , which is ArrayIndexOutOfBounds ,so we have to take index
 */