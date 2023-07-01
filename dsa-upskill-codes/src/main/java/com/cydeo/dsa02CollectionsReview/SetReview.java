package com.cydeo.dsa02CollectionsReview;

import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. create Set / no duplicates
        Set<Student> set = new HashSet<>();
        //2. add element to set
        set.add(new Student(1, "Jack"));
        set.add(new Student(2,"Julia"));
        set.add(new Student(3,"Mike"));
        set.add(new Student(4, "Mary"));
        System.out.println(set);
        String str = "Java Developer";
        System.out.println(firstRepeatingChar(str));
    }

    public static Character firstRepeatingChar(String str){//time of complexity O(n)// running steps

        //create a hashSet
        Set<Character> chars = new HashSet<>();// space complexity O(n)// because i created another data Structure//additional space in memory
        //iterate over the char Array and add chars into hashSet
        for(Character ch:str.toCharArray()) if (!chars.add(ch)) return ch;

        //if add duplicates is false //return that char


        return null;
    }

}
