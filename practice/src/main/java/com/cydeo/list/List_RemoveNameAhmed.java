package com.cydeo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNameAhmed {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Murat");
        names.add("Omer");
        names.add("Yusuf");
        names.add("Ahmed");
        System.out.println(remove(names));
    }

    public static List<String> removeName(List<String> names){
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            if(it.next().equals("Ahmed"))
                it.remove();
        }
        return names;
    }
//solution 2
    public static List<String> remove(List<String> names){
        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }

    //solutin 3





}
/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/