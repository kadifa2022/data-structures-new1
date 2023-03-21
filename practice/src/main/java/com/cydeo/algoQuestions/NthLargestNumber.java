package com.cydeo.algoQuestions;

import com.cydeo.day2_arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args){

        ArrayList<Integer> largest= new ArrayList<>();
        largest.addAll(Arrays.asList(1,2,3,4,5,5,6,6,6,7,7,8));
        int n = 4;
;
        int largestNth = 0;

        Collections.sort(largest);
        ArrayList<Integer> nonDupe= new ArrayList<>();
        for(Integer each: largest){
            if(nonDupe.contains(each)){
                continue;
            }
            nonDupe.add(each);
        }
        largest = nonDupe;
        largestNth = nonDupe.get(nonDupe.size()-n);
        System.out.println(largestNth);

     }
}
