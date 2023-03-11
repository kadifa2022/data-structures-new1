package com.cydeo.day2_arrays.twosum;


import java.util.Arrays;

public class Find3TopNumbers {

    public static void main(String[] args) {
        int[] array = {10, 10, 12, 4, 5,};
        System.out.println(Arrays.toString(findTop3Numbers(array)));


    }
    public static int[] findTop3Numbers(int [] array){
        int min=Integer.MIN_VALUE, mid=Integer.MIN_VALUE, max=Integer.MIN_VALUE;
        for (int i = 0; i <array.length ; i++) {

            if(array[i]>max){
                min=mid;
                mid=max;
                max=array[i];
            }else if(array[i]>mid){
                min=mid;
                mid=array[i];
            }else if(array[i]>min){
                min=array[i];
            }

        }
        return new int[] {max,mid,min};


    }
}