package com.cydeo.session_11_SpiralTraverse;



import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {

    public static void main(String[] args) {

        int [][] arr=  {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};

        System.out.print(printMatrixTraversal(arr));






    }
   public static List<Integer> printMatrixTraversal(int [][] arr) {

        int left =0, top = 0, bottom = arr.length-1, right = arr[0].length-1;

        List<Integer> list = new ArrayList<>();

        while (top <= bottom && left <=right){
            //first column
            for(int i = left; i <=right; i++)
                list.add(arr[top][i]);
            top++;//moved to next row

            //print last column
            for(int i= top; i<=bottom; i++)
                list.add(arr[i][right]);
            right--;
            //last low
         //   if (top <= bottom) {

                for (int i = right; i >=left ; i--) {
                    list.add(arr[bottom][i]);
                    bottom--;

                }
             //   if(left<=right) {
                    for (int i = bottom; i >= top; i--) {
                        list.add(arr[i][left]);
                        left++;

                    }

                }
        return list;
        }


   }



