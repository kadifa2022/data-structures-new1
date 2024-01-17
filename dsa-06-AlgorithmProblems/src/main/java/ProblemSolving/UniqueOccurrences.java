package ProblemSolving;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurrences {
    public static void main(String[] args) {
        int[] myArray = new int[] {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(myArray));
    }


    //number of occurrences or frequencies (should re mind me of hashMap structure)
    //unique (should remind me if HashSet structure, set does not allow dup) and if we add some value returns boolean.
    // getOrDefault if we already have key will increase value 1, otherwise will increase key and value
    // sorting is nlog(n)
    public static boolean uniqueOccurrences(int[] arr){
        //create hashMap
        HashMap<Integer, Integer> freq= new HashMap<>();// for the Elements and  number of  frequencies
        // count number of occurrences and put them in map
        for (int i : arr) { // every element in arr i will put in my map
            freq.put(i,freq.getOrDefault(i,0)+ 1 ); // using 0 as default value and increasing by 1
        }
        // put the freq in a set and find if there are any duplicated value
        Set<Integer> freqSet = new HashSet<>();

        for (Integer value : freq.values()) {// to get the frequency
            // return false if you add duplicates
            if(!freqSet.add(value)) return false;
        }
        // There are no duplicates, frequencies are unique...
        return true;
    }

    public static boolean uniqueOccurrences2(int[] arr){
        //create hashMap
        HashMap<Integer, Integer> freq= new HashMap<>();// for the Elements and  number of  frequencies
        // count number of occurrences and put them in map
        for (int i : arr) { // every element in arr i will put in my map
            freq.put(i,freq.getOrDefault(i,0)+ 1 ); // using 0 as default value and increasing by 1
        }
        // put the freq in a set and find if there are any duplicated value
        Set<Integer> freqSet = new HashSet<>(freq.values()); // We use frequency of value to create set

        // There are no duplicates, frequencies are unique...
        // if the size of the map and set are equals thi means that there are no duplicates
        return freqSet.size() == freq.values().size();
    }

}
