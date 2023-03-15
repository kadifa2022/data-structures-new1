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
        System.out.println(remove2(names));
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

    //solution3

    public static List<String> remove2(List<String> names){
        names.removeIf(name-> name.equals("Ahmed"));
        return names;
    }





}
/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/