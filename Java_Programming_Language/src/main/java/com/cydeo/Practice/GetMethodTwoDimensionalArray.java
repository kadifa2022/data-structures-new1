package com.cydeo.Practice;



public class GetMethodTwoDimensionalArray {

    public static void main(String[] args) {

        int [][] integers = {
                {1,10,3,8},
                {9,12,6,7,},
                {5,2,11,4}};

        for (int i = 0; i <3 ; i++)

            System.out.println("Row " + (i + 1) + ": " + getMax(integers[i]));

    }
    public static int getMax(int[] integers){
        int max = integers[0];
        for(int i = 0; i <integers.length; i++)
           //ternary operator: if the current element which is sub i,  is less than integer sub [i],
                // that means we have new integer sub [i] new  max ?  if is not true max stay as it is
            max = (max<integers[i]) ? integers[i] :max;
        return max;

    }

}
