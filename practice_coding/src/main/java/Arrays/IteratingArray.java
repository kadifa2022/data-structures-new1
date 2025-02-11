package Arrays;

public class IteratingArray { // using for loop
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50};
        //  indexes        0  1  2  3  4

        /*  //instead of repeating each one we can create loop
        System.out.println(numbers [0]);
        System.out.println(numbers [1]);
        System.out.println(numbers [2]);
        System.out.println(numbers [3]);
        System.out.println(numbers [4]);

         */
         // - 1  to find the last index  number same for string
        for(int i =0; i <=  numbers.length -1  ; i++){
            System.out.println(numbers[i]); // 0-4 index
        }
        System.out.println("-----start from the back -----------------");

        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }

        String [] fruits ={"Orange","Banana","Apple", "Strawberry", "Lemon", "Grape"};
        // indexex:           0       1         2          3           4       5

        for (int i = 0; i < fruits.length ; i++) {
            System.out.println(fruits [i]);

        }
        System.out.println("---Reversed order----------");


        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }


    }
}
