package Arrays;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {


        int [] array = new int[5]; // Fixed DS //searching is faster
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array = new int[3]; // assign to new array // the first array is eligible for GC
        System.out.println(Arrays.toString(array));


        System.out.println("second way of creating array");

        int [] scores = {10,20,30,40,50};
       // int [] scores2 = new int []{10,20,30,40,50};

        System.out.println(" Multi-dimensional array ");

        int [][] arr2D = {{1,2},{3,4}}; // for 1-D Array
        String [][] arr3D ={{"Sara","Lidia"}, {"Tina","Tony"}, {"Lina", "Leo"}}; // for 2-d array

    }
}
