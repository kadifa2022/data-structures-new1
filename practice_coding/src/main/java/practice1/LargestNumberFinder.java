package practice1;

public class LargestNumberFinder {
    public static void main(String[] args) {
        int [] numbers = {10,7,23,45,8}; // input
        int largestNumber = findLargestNumber(numbers);
        System.out.println(largestNumber);// output
    }
    public static int findLargestNumber(int [] array){
        // Assume the first element is the largest number
        int largest = array[0];

        // iterate through the array to find the largest number
        for(int i= 1; i < array.length; i++){

            if(largest<array[i]){
                // update the largest if larger number is found
                largest = array[i];
            }
        }
        return largest;

    }

}
