package com.cydeo.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNumbers {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(100);
        num.add(200);
        num.add(30);
        num.add(40);
        System.out.println(removeNum(num));

    }

    public static List<Integer> removeNum(List<Integer> list){
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next()<100){
                it.remove();
            }
        }
        return list;
    }

    //solution 2

    public static List<Integer> removeNum3(List<Integer> list){
        list.removeIf(number->number>100);
        return list;
    }



}
 /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    */