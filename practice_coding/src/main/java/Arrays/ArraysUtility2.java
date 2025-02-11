package Arrays;

import lab6_CustomMethods.StringUtility;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        // toString(): converts array object to the string, returns String
        String [] names = {"James", "Smith", "Shay","Breanna", "Josh"};
        System.out.println(Arrays.toString(names));

        //sort(): sorts the array in ascending  order
        int [] numbers = {3,4,1,2,7};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //equals(): compares two array objects if they have same elements in same order
        char [] arr1 = {'a','b','c'};
        char [] arr2 = {'b','a','c'};

        System.out.println(Arrays.equals(arr1, arr2)); // returns boolean
        Arrays.sort(arr1);//{'a','b','c'};
        Arrays.sort(arr2);//{'a','b','c'};
        System.out.println(Arrays.equals(arr1, arr2));

        //copyOf(array, newLength) : copies the specified array elements and sets new length, returns new array
        int [] scores= {45,55,45,75,85};
        int [] scores2 = Arrays.copyOf(scores, 8 );// also, can be less than original array [3]
        System.out.println(Arrays.toString(scores2));

        //copyOfRange(array, begIndex, EndIndex): copy the specific range of array, returns new array
        char [] element = {'A','B','C','D','E','F'};
        char [] someCharacter =  Arrays.copyOfRange(element, 0,3 +1);

        System.out.println(Arrays.toString(someCharacter));










    }

}
