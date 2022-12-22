package com.cydeo.algoQuestions;

public class MultiplyElements {

   //first solution
    static int[] multiplyElements(int[] ints){
        if(ints == null) return null;
        int n = ints.length;
        if( n == 1 )return ints;
        int[] result = new int[n];
        result[0] = ints[0] * ints[1];
        result[n-1] = ints[n-2] * ints[n-1];

        for (int i = 1; i < n-1; i++) {
            result[i] = ints[i - 1]* ints[i + 1];

        }

        return result;

    }
    //second solution
    static int[] multiply_Array(int[] num){
        //nothing to do when array size is 1

        if(num.length<=1) return num;
        int prev=1;
        for(int i=0; i <num.length;i++){
            //calculate first element
            if(i==0){
                prev = num[i];
                num[i]=num[i] * num[i +1];
            }//calculate last element
            else if(i==num.length-1){
                num[i]=prev*num[i];
            }
            //calculate rest of elements
            else{
                int temp = num[i];
                num[i]= prev*num[i+1];
                prev=temp;
            }
        }
        return num;
    }




}
/*
Given an array of integers, update every element with the multiplication of previous and next elements with the
following exceptions.
a) The First element is replaced the by multiplication the of first and second.
b) The last element is replaced by multiplication of the last and second last.

Input : arr[] = {2, 3, 4, 5, 6}
Output : arr[] = {6, 8, 15, 24, 30}

 */