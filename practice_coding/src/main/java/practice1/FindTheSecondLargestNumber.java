package practice1;

public class FindTheSecondLargestNumber{
    public static void main(String[] args) {
        int [] numbers = {10,7,23,45,8};
        int secondLargest = findSecondLargest(numbers);
        System.out.println(secondLargest);

    }
    public static int findSecondLargest(int [] array){
        int largest = Integer.MIN_VALUE;// or 0
        int secondLargest = Integer.MIN_VALUE;// or 0

        for(int i = 0; i < array.length; i++){
            int num = array[i];
            if(largest < num){
                secondLargest = largest;
                largest = num;
            }// {10,7,23,45,30}; // complex case
            else if (num > secondLargest && num != largest){
                secondLargest = num;

            }
        }
        return secondLargest;
    }



}
