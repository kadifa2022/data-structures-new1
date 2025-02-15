package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {


        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy Sauce");
        groceryList.add("Sugar");
        groceryList.add("Salt");
        System.out.println(groceryList);


    // contains()check for the given element/  returns boolean
     boolean r1 = groceryList.contains("Apple");
        System.out.println(r1);

    // equals(list) checks if the arrayList is equal to given list / returns boolean

        ArrayList<String> list1= new ArrayList<>();
        list1.add("Banana");
        list1.add("Apple");
        list1.add("Cheese");
        list1.add("Soy Sauce");
        list1.add("Sugar");
        list1.add("Salt");

        boolean checkLists = groceryList.equals(list1);
        System.out.println(checkLists);


        // isEmpty() checks if the ArrayList isEmpty , (size is 0) returns boolean

       boolean r3=  groceryList.isEmpty();
        System.out.println(r3);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(10);
        numbers.add(30);
        numbers.add(30);
        numbers.add(50);
        numbers.add(60);

        //containsAll( CollectionType): checks of the  ArrayList contains all the given collection of values, return type boolean
          boolean b4 =numbers.containsAll( Arrays.asList(10,20,30,40));
        System.out.println(b4);

        // addAll(CollectionType) adds all the given collection of value to the arrayList
        boolean b5= numbers.addAll(Arrays.asList(70,80,90,100));
        System.out.println(b5);
        System.out.println(numbers);

        // removeAll(CollectionType) removes all the matching values from the arrayList

       boolean b6 =  numbers.removeAll(Arrays.asList(10,30,40,60));
        System.out.println(b6);
        System.out.println(numbers);

        // retainAll(CollectionType) remove all un-matching  values from arrayList, (keeps matching values only
         boolean r6 = numbers.retainAll(Arrays.asList(10,50,60));
        System.out.println(r6);
        System.out.println(numbers);


    }
}
