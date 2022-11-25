package com.cydeo.day2_arrays.frequencyAndConvertingToWord;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class WithStreamAndEnum {
    public static void main(String[] args) {



    }

    static void withStreamAndEnum(int[] arr){
        if(arr==null || arr.length==0){
            System.out.println("array is empty");
            return;
        }
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i->i, Collectors.counting()))
                .forEach((k,v)->{
            long n=v<=11 ? v:11;
                    System.out.println(k + " is " +NumberToWord.values()[(int) n].value + "times");
        });
    }

}
