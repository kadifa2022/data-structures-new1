package com.cydeo.javaCore;

public class Array_findUniqueElement {

    public static void main(String[] args) {
        int [] array={10,2,3,3,4,4};
        System.out.println(firstDuplicatedElement(array));


    }

    public static int firstDuplicatedElement(int []array){
        int firstDuplicated= 0;
        for(int each :array){
            int frequency = 0;
            for(int each2: array){
                if(each == each2);
                frequency++;
            }
            if (frequency > 1){
                firstDuplicated= each;
                break;
            }
        }
        return firstDuplicated;
    }

}
