package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Session_1_KidsWithCandies {
    public static void main(String[] args){
        int [] candies={2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3).toString());

        System.out.println(kidsWithCandies1(candies,2).toString());
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){

        List<Boolean> result= new ArrayList<>();

        // find max of candies []

        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]> max){
                max= candies[i];
            }
        }
        //compare each candies
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies>=max) result.add(true);
            else result.add(false);

        }
        //return result
        return result;
    }

    public static List<Boolean> kidsWithCandies1(int[] candies, int extraCandies){
        List<Boolean> result= new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int candy : candies){
            result.add(candy+extraCandies>=max);
        }
        return result;
    }



}
