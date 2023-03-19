package com.cydeo.algoQuestions;

import com.cydeo.day2_arrays.Array;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0;
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];

        }
        System.out.println(Arrays.toString(arr3));


    }
}