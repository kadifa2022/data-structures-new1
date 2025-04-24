package com.cydeo.ashokIT.happyCode;

import java.util.Arrays;

public class SortAnArray_BubbleSort {
    public static void main(String[] args) {
        int [] numbers = {5,2,1,9};
        // Arrays.sort(numbers; // sort the array in ascending order
        bubbleSortArray(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void bubbleSortArray(int[] array) {
        int n = array.length;
        boolean swapped;
        // other for loop
        for(int i = 0; i < n-1; i++){
            swapped =false;
            // inner for loop
            for(int j =0 ; j<n-1-i; j++){
                if(array[j] > array[j + 1]){
                    // swap array[j]  and array [j+ 1]
                    int temp = array[j];
                    array[j] = array[j +1];
                    array[j+1] =temp;
                    swapped =true;
                }
            }
            // if no two elements were swapped loop, then break
            if(!swapped)break;
        }
    }
}
/*
In bubble sort, compare and swap adjacent elements if they are not ordered.
Repeat those steps to move the largest to the end until the array is sorted.
 */