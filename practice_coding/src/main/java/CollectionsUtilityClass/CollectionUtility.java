package CollectionsUtilityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        /*

Collections is DS and has utility classes.
  -presented in "java.util package

  Methods:
  sort(list) : sorts the list in ascending order
  max(list): returns the max number
  min(list): returns the min number
  revers(list): reverse the list
  swap(list, index1, index2): swaps the elements at the given indexes
  frequency(list, element): returns the frequency of the element from the list
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,440,520,60,70,80,80,80,80));
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("sort " + numbers);


        int max = Collections.max(numbers); // for max() we need to assign back return type

        System.out.println("max = " + max);


         int min =  Collections.min(numbers);
        System.out.println("min = " +min);



        System.out.println("---reverse");

        Collections.reverse(numbers);
        System.out.println(numbers);

        System.out.println("----Swap() from collections" );
        System.out.println(numbers);

        Collections.swap(numbers, 0,5);
        System.out.println(numbers);

        Collections.swap(numbers, 0, numbers.size()-1);
        System.out.println("Swap last index in list  " + numbers);

        System.out.println("--Frequency() --------");
        numbers.addAll(Arrays.asList(1,1,1,1,1,2));
        int freq = Collections.frequency(numbers,1);
        System.out.println(freq);


    }
}
