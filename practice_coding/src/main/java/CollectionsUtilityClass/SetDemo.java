package CollectionsUtilityClass;

import java.util.*;

public class SetDemo {// no duplicated
    public static void main(String[] args) {
        // no index number can't use for loop to iterate
        // we can use forEach loop only


        Set<Integer> hashSet = new HashSet<>();//random order/accept null as value
        hashSet.addAll(Arrays.asList(10,20,30,40,50,60,100,70,90));
        hashSet.add(null);
        System.out.println(hashSet);

        Set<Integer> linkedHashSet=  new LinkedHashSet<>();// insertion order// accept null as value
        linkedHashSet.addAll(Arrays.asList(10,35,32,47,20,20));
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();// sorted/ ascending order/ do not accept null
        treeSet.addAll(Arrays.asList(10,32,45,1,66,21,11));
        //treeSet.add(null); // nullPointerException
        System.out.println(treeSet);

        System.out.println();

        for (Integer each : hashSet) {
            System.out.println(each);
        }

        for (Integer each : linkedHashSet) {
            System.out.println(each);
        }
        for (Integer each : treeSet) {
            System.out.println(each);
        }





        }

        }



