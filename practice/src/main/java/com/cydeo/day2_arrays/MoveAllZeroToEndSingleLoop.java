package com.cydeo.day2_arrays;

import java.util.Arrays;

public class MoveAllZeroToEndSingleLoop {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 7};
        System.out.println(Arrays.toString(moveAllZero(arr)));
        System.out.println(Arrays.toString(moveAllZeroToTheEnd(arr)));
    }

    public static int[] moveAllZero(int[] array) {
        int fast = 0;
        int slow = 0;

        while (fast < array.length - 1) {
            if (array[slow] != 0) {
                slow++;
            }
            if (fast <= slow || array[fast] == 0) {
                fast++;
            }
            if (array[slow] == 0 && array[fast] != 0) {
                array[slow] = array[fast];
                array[fast] = 0;
            }

        }
        return array;
    }

    public static int[] moveAllZeroToTheEnd(int[] arr){
        int fast = 0;
        int slow = 0;
        while(fast<arr.length -1){
            if(arr[slow] !=0){
                slow++;
            }
            if(fast<= slow || arr[fast]==0){
                fast++;
            }
            if(arr[slow] ==0 && arr [fast] !=0){
                arr[slow] = arr[fast];
                arr[fast]=0;
            }
        }
        return  arr;

    }

}