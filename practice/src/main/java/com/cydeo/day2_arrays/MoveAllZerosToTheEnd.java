package com.cydeo.day2_arrays;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveAllZerosToTheEnd(new int[]{1,0,2,0,0,7})));

    }
    //[1,0,2,0,0,7]

    public static int [] moveAllZerosToTheEnd(int [] array){
        //create ew array
        //for loop
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counter++;
            }
        }
            int[] arrayForNotZero=new int[array.length-counter];
            int indexOf=0;
            for (int j = 0; j < array.length; j++) {
                if(array[j]!=0){
                    arrayForNotZero[indexOf]=array[j];
                    indexOf++;
                }
            }

           int[] zero=new int[counter];
            for (int i = 0; i < zero.length; i++) {
                zero[i]=0;

            }
            int [] combine=new int[array.length];

            combine= Arrays.copyOf(arrayForNotZero,array.length);


            //combine=Arrays.copyOf(zero, zero.length);



        return combine;
    }

}
