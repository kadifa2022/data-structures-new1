package com.cydeo.session_2_MergeSortedArray;

import java.util.Arrays;

public class Session_2_MergeSortedArray {
    public static void main(String[] args) {
        int [] nums1= {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        System.out.println(Arrays.toString(mergeSortedArray(nums1, 3,nums2,3)));



    }

    public static int [] mergeSortedArray(int[] nums1, int m, int[]nums2, int n){
        int p1 = m-1, p2 = n-1, i = m+n-1;
        while (p2>=0){
            if(p1>=0 && nums1[p1] >nums2[p2]){
                nums1 [i--]= nums1[p1--];

            }else {
                nums1[i--]=nums2[p2--];
            }
        }

        return nums1;
    }

    //second solution
    public void mergeSortedArray2(int[] nums1, int m, int[] nums2, int n){
        //Ptr1 for first array Ptr2 for the second array
        int ptr1 = m-1;
        int ptr2 = n-1;

        //and move p backwards from end through the array
        //write the smallest value pointer at by p1 or p2 to nums1
        for (int p = n+m-1; p >=0 ; p--) {
            if(ptr2<0){
                break;
            }
            if(ptr1>=0 && nums1[ptr1]> nums2[ptr2]){
                nums1[p] = nums1[ptr1--];

            }else{
                nums1[p] = nums2[ptr2--];
            }

        }

    }
}