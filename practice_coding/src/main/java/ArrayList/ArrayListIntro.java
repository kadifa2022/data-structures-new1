package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());

      // add() elements into list, size will increase by1
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy Sauce");
        groceryList.add("Sugar");
        groceryList.add("Salt");
        System.out.println(groceryList);


     // size() returns the total number of element of the ArrayList, return type int
        int a = groceryList.size();
        System.out.println(a);

    // get(index) -returns the element of given index
        System.out.println(groceryList.get(2));


    // set(index, newElement) replaces the element of the arrayList at given index to the new element
        System.out.println(groceryList.set(1, "Bread"));
        System.out.println(groceryList);


    // remove(int index) removes the element of the given index from the arrayList
        System.out.println(groceryList.remove(1));

    // remove (object) removes first matching object
    boolean r =groceryList.remove("Sugar");
        System.out.println(r);
        System.out.println(groceryList);



    // clear() - removes all object from arrayList
        groceryList.clear();
        System.out.println(groceryList);

        System.out.println("New list ");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);

        // indexOf(element) returns the index number of the first matching element(20) from arrayList
        // returns int
        int b = numbers.indexOf(20);
        System.out.println(b);

        // lastIndexOf(element) returns the index of last matching element from the arrayList
        int c = numbers.lastIndexOf(20);
        System.out.println(c);


    }

}
