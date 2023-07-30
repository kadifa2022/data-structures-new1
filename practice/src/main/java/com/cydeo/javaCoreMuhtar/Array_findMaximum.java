package com.cydeo.javaCoreMuhtar;

public class Array_findMaximum {
      /*
Write a function that can find the maximum number from an int Array */
      public static void main(String[] args) {
          int[] myArray= {20,45,6,6,7,8,9,0,0,1,2,2,3,3,3};
          System.out.println(maxValue(myArray));
          System.out.println(minValue(myArray));

      }
    public static int maxValue(int[] n){

        int max = Integer.MIN_VALUE;
        for(int each: n){
            if(each>max){
                max = each;
            }
        }
        return max;

    }

    public static int minValue(int[] number){
          int min = Integer.MAX_VALUE;
          for(int each: number){
              if(each<min){
                  min = each;
              }
          }
          return min;
    }



}
