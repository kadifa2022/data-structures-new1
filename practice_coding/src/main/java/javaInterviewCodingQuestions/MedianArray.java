package javaInterviewCodingQuestions;

import java.util.Arrays;

public class MedianArray {// check
    public static void main(String[] args) {
        int [] array ={ 12,4,9,8,6};
        double median = findMedian(array);
        System.out.println("Median = " + median);

    }
    public static double findMedian(int[] array){
        Arrays.sort(array);
        int n = array.length;
        if(n%2==1){
            return array[n/2];
        }else{
            return (array[n-1]/2 + array[n/2]/2.0);
        }
    }
}
