package com.cydeo.list;

import java.util.Iterator;
import java.util.List;

public class List_RemoveNameAhmed {

    public static List<String> removeName(List<String> names){
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            if(it.next().equals("Ahmed"))
                it.remove();
        }
        return names;
    }


}
/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/