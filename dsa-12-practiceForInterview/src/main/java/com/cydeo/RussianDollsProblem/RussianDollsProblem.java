package com.cydeo.RussianDollsProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class RussianDollsProblem {

    public static void main(String[] args) throws IOException {
        //creating an object of BufferedReader class
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number  of dolls");
        //Reading input number of dolls
        int numDolls = Integer.parseInt(bi.readLine());
        //Custom integer array of size N from input
        Integer dolls[] = new Integer[numDolls];
        //Array of string type to store input
        String[] strNums;
        System.out.println("Enter string of Dolls size with spaces");
        //Reading input a String
        strNums = bi.readLine().split(" ");


        for (int i = 0; i < strNums.length ; i++) {
            dolls[i] = Integer.parseInt(strNums[i]);

        }
        System.out.println(remainingDolls(dolls));
    }
    static int remainingDolls(Integer[] dolls){
        int result = 1;
        Arrays.sort(dolls, Collections.reverseOrder());
        int lastInsertedDollPosition = 0;
        for (int i = 1; i <dolls.length ; i++) {
            if(dolls[lastInsertedDollPosition]> dolls[i]) {
                lastInsertedDollPosition=i;

            }else{
                result++;
            }

        }
        return result;
    }
}


