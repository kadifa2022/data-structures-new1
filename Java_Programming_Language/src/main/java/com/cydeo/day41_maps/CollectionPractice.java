package com.cydeo.day41_maps;

import com.cydeo.Day28_OOP_concepts.abstraction.employeeTask_Abstraction.Employee;

import java.util.*;

public class CollectionPractice {// collections is just single entity for individual object

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11,12,13));

        List< List<Integer>> lists = new ArrayList<>();
       // lists.addAll(Arrays.asList(list1,list2));

        lists.add(list1);
        lists.add(list2);

        // 10
        System.out.println(lists.get(1).get(3));


        for (List<Integer> eachList : lists) {//loop for list
            for (Integer eachElement:eachList) {// loop for elements
                System.out.println(eachElement);

            }
        }
        System.out.println("----------------------------------------");
        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());

        System.out.println(listOfSets);
        listOfSets.get(0).addAll(Arrays.asList(10,5,20,20,10,5));
        listOfSets.get(1).addAll(Arrays.asList(130,5,249,260,10,5));// set does not support duplicates
        listOfSets.get(2).addAll(Arrays.asList(10,55,20,23,10,5));
        listOfSets.get(3).addAll(Arrays.asList(100,5,240,20,29,40));

        System.out.println(listOfSets);


        System.out.println("-----------------------Arrays----------------------------");

        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {7,8,9,10,11,12,13};

        List<int[]> listOfArrays= new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);
       // System.out.println(listOfArrays);
        System.out.println(Arrays.toString(listOfArrays.get(0)));

        listOfArrays.get(0)[2]= 35;// to replace in first array in the list of arrays 3rd element
        System.out.println(Arrays.toString(listOfArrays.get(0)));// print the first []

        // List objects that contains employee objects
        List<List<Employee>>  teams = new ArrayList<>();




        List<int[][]>  l = new ArrayList<>();



    }
}
