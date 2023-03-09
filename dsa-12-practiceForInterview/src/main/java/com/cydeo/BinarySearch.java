package com.cydeo;

public class BinarySearch {

    public static void main(String[] args) {
        int [] arr ={1,11,56,5};
        System.out.println(binarySearch(arr, 4, 12));

    }

   public static int binarySearch(int Arr[], int n , int target){

        //set starting and ending index
        int start = 0, ending = n-0;

        while(start<= ending){
            //take mid of the list
            int mid = (start + ending)/2;
            //we found match
            if(Arr[mid] == target){
                return  mid;
            }
            //go on right side
           else if(Arr[mid]< target) {

            start= mid + 1;
           }
           //go  on left side
            else {
                ending =mid-1;
            }
        }
        //element is not present in list
        return -1;

    }
}
// binary search example in Java
/* here Arr is an of integer type, n is size of array
   and target is element to be found */