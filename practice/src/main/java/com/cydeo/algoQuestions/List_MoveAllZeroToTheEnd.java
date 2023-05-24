package com.cydeo.algoQuestions;

import java.util.Arrays;
import java.util.List;

public class List_MoveAllZeroToTheEnd {

    /*
    Write a program tht can move all zero to the end of the List of the Integers
     */

    public static List<Integer> moveZeroToTheEnd(List<Integer>list){
        int originalSize= list.size();

        list.removeAll(Arrays.asList(0));
        int newSize = list.size();

        int totalNumberOfZeros = originalSize - newSize;
        for(int i = 0; i <totalNumberOfZeros; i++){
            list.add(0);
        }
        return list;
    }
}
