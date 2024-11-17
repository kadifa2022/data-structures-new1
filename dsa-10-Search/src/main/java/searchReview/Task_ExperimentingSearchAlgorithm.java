package searchReview;
// performanceCalculationOfSearchAlgorithm
public class Task_ExperimentingSearchAlgorithm {
    public static void main(String[] args) {
       // System.out.println(linearSearch());

    }

    public static long [] linearSearch (int []array, int data){
        long [] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparisons = 0;
        for (int i = 0; i < array.length; i++) {
            comparisons ++;
            if(array[i]== data){
                result [0] = System.currentTimeMillis()-startTime; // execution time
                result[1] = comparisons; // number of comparisons
                return result;

            }
        }
        return  new long[2]; // if we can't find return empty array

    }

}
