package com.cydeo.day40_collections;

import java.util.*;

public class IterablePractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10));
        Iterator<Integer> iterator = list.iterator();
        System.out.println(iterator.hasNext());// if is  no elements  will return false
        System.out.println(iterator.next());


        System.out.println("---------------------------------");

        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed", "ahmed", "aHmed","John", "daniel","Mustafa", "Mohamed", "chris"));

                //manully
          Iterator<String> it =  names.iterator(); //get the Iterator object  from collection

        while(it.hasNext()){//become false
            String each = it.next();
            if(each.equalsIgnoreCase("Ahmed")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("---------------------------------------------------------------");


        List<String> names2 = new ArrayList<>();

        names2.addAll(Arrays.asList("Ahmed", "ahmed","ahmed", "aHmed","John", "daniel","Mustafa", "Mohamed", "chris"));

        names2.removeIf(p->p.equalsIgnoreCase("Ahmed"));// implicitly given iterator

        System.out.println(names2);

        System.out.println("---------------------------------------------");


        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,9,1,2,3,4,6,9));

        //find the nth  largest number

        int n = 2;
      //  int max = 0;

        for(int i = 0; i< n-1; i ++){
            numbers.removeIf(p-> Collections.max(numbers) == p);

            }
        int max = Collections.max(numbers);
        System.out.println(max);


        }

    }

