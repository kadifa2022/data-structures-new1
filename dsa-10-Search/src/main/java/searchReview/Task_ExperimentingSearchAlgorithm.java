package searchReview;
// performanceCalculationOfSearchAlgorithm
public class Task_ExperimentingSearchAlgorithm {
    public static void main(String[] args) {
        int[] numbers = new int [1000000];
        for(int i =0; i<1000000;i++){
            numbers[i] = i;
        }
        long[] linearSearchResults= linearSearch(numbers, 333333);
        System.out.println("Linear Search Result: " + linearSearchResults[0] + " milliseconds and " + linearSearchResults[1] + " comparisons.." );

    }

    public static long [] linearSearch (int []array, int data){
        long [] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparisons = 0;
        for (int i = 0; i < array.length; i++) {
            comparisons ++;
            if(array[i]== data){
                result [0] = System.currentTimeMillis()-startTime; //search time/ execution time
                result [1] = comparisons; // number of comparisons
                return result;
            }
        }
        return  new long[2]; // if we can't find return empty array
    }
    public static long [] binarySearchIterative(int[] array, int data){
        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparisons =0;
        int left = 0;
        int right =array.length-1;
        while(left <= right){

        int  middle = (left + right)/2;
        comparisons ++;
        if(array[middle] == data) {
            result [0] = System.currentTimeMillis() -startTime;
            result [1] = comparisons;
            return  result;}
        comparisons ++;
            if(data<array[middle]) right = middle-1;
            else left = middle +1;
        }
        return  new long[2];
    }

}
