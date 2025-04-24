package com.cydeo.ashokIT;

import java.util.Arrays;

public class SortStringCharacters {
    public static void main(String[] args) {

        String str = "rock";

        System.out.println("Approach 1 Without using sort method");

       char arr []= str.toCharArray(); // converting string to arr // method available in string class
       char temp;
        for (int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp= arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));

        System.out.println("Approach 2 With sort method");
        String str1 = "rock";
       char [] arr2 =  str1.toCharArray();
        Arrays.sort(arr2);
        System.out.println(new String(arr2));







    }

}
// store String characters in Alphabetical Order