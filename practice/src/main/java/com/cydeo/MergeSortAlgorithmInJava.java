package com.cydeo;

import java.util.Random;

public class MergeSortAlgorithmInJava {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int [1000];

        for(int i = 0; i <numbers.length; i++){
            numbers[i] = rand.nextInt(1000000);
        }
        System.out.println("Before");
        printArray(numbers);

        mergeSort(numbers);
        System.out.println("\nAfter:");
        printArray(numbers);
    }
    private static void mergeSort(int[]inputArray){
        int inputLength = inputArray.length; //create variable
        if(inputLength< 2){
            return;
        }
         int midIndex = inputLength /2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength-midIndex];

        //fil up the left half of []
        for(int i = 0; i <midIndex; i++){
            leftHalf[i] = inputArray[i];
        }
        for(int i= midIndex; i < inputLength; i++){
            rightHalf[i-midIndex] = inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        // merge and call method

        merge(inputArray,leftHalf,rightHalf);

    }
    public static void merge(int[] inputArray, int[]leftHalf, int[]rightHalf){
        int leftSize= leftHalf.length;
        int rightSize = rightHalf.length;
        int i =0, j=0, k=0;
        while (i<leftSize && j<rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k]=leftHalf[i];
                i++;
            }else{
                inputArray [k]= rightHalf[j];
                        j++;
            }
            k++;
        }//loop through and add any remaining elements
        while (i<leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j<rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }



    private static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

}
