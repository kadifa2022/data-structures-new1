package com.cydeo.ashokIT.happyCode;

public class SumOfAllElementsInArray {
    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5,6};
        int sum = calculateSum(numbers);
        System.out.println(sum);
    }
    public static int calculateSum(int [] array){

        int sum =0;
        for(int i = 0; i < array.length;i++){
           sum = sum + array[i];// add each element to the sum
        }
        return sum;
    }
}
