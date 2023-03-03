package com.cydeo;

public class FindMaxTreeNumbers {
    public static void main(String[] args) {
        int [] array = {10,5,9,10, 12};
        System.out.println(findTreeMaxNumbers(array));


    }
    public static int [] findTreeMaxNumbers(int [] array){

        int  min = Integer.MIN_VALUE, mid = Integer.MIN_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i <array.length ; i++) {

            if(array[i] >max){
                min= mid;
                mid= max;
                max= array[i];
            }else if(array[i]>mid){
                min=mid;
                mid=array[i];
            }else if(array[i]>min){
                min=array[i];
            }

        }
        return new int[]{min, mid, max};
    }


}
