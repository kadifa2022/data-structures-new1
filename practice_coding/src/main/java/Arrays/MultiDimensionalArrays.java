package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50};
        int[] arr3 = {60, 70, 80, 90};
        /*

        int[][] arr2D = new int[3][]; // store arrays into 1D
        arr2D[0]= arr1;
        arr2D[1]=arr2;
        arr2D[2]=arr3;

        System.out.println(arr2D[0][1]);

         */

        int[][] arr2D = {{10, 20, 30}, {40, 50}, {60, 70, 80, 90}};
        // how to print multidimensional  array
        System.out.println(Arrays.deepToString(arr2D));

        // how to retrieve single Dimensional Array from multi dimensional
        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][2]);



    /*
    group1= {"Ahmed", "Jimmy"};
    group2={"Breanna", "Victoria", "Daniel"};
    group3={"Natalia", "Aaron", "Christina","Josh"};
     */
        String[][] names2D = {{"Ahmed", "Jimmy"}, {"Breanna", "Victoria", "Daniel"}, {"Natalia", "Aaron", "Christina", "Josh"}};
        System.out.println(Arrays.deepToString(names2D));
        System.out.println(Arrays.toString(names2D[2]));
        System.out.println(names2D[2][3]);
    }
}
