package com.cydeo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZeroToEnd {

    public static void main(String[] args) {
        List<Integer> newList =  new ArrayList<>();
        newList.add(0);
        newList.add(0);
        newList.add(3);
        newList.add(4);
        System.out.println(moveAllZeroToTheEnd(newList));


    }


    public static List<Integer> moveAllZeroToTheEnd(List<Integer> list) {
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();

        int totalNumberOfZeros = originalSize-newSize;
        for(int i= 0; i<totalNumberOfZeros; i++ ){
            list.add(0);
        }
        return  list;

    }
}
 /*
    write a program that can move all the zeros to the end of the List of integers
    */