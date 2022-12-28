package com.cydeo.algoQuestions;

public class FindMissingNumber {

    public static void main(String[] args) {


        int num[] = {1, 3, 4, 5, 6, 7};
        int n1 =findMissingNumber(num, 15);
        System.out.println(n1);

    }
    public static int findMissingNumber(int num[], int totalCount){
        int expSum= totalCount*((totalCount+1)/2);
        int actualSum=0;
        for(int i : num){
            actualSum+=1;
        }
        return expSum-actualSum;
    }
}