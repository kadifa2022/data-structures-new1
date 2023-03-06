package com.cydeo;

import java.util.ArrayList;

public class AverageBox {
    public static void main(String[] args) {
       // Integer[] array = {10,5,9,10,12,11,10};//
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(12);
        System.out.println(boxAverage(ans));

    }




    public static int boxAverage(ArrayList<Integer> ans){

        int  min = ans.get(0);
        int  max = ans.get(0);
        for (Integer a: ans) {
            if(a>max) max=a;
            else if(a <min) min = a;
        }
       // return (int) Math.ceil (((float)min + max)/2);
        return (min+max)/2;
    }

}
