package co.cydeo.lab12_array_collection_map;

import co.cydeo.lab11_exception_and_polymorphism.restuarant_task.Chef;
import co.cydeo.lab11_exception_and_polymorphism.restuarant_task.Employee;
import co.cydeo.lab11_exception_and_polymorphism.restuarant_task.Server;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        //Declaring array
        int [] nums = new int [3];// GC
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        nums= new int[5]; //after re assign first object is eligible for GC
        System.out.println(Arrays.toString(nums));

        System.out.println("-------------another way to create Array -literal----------");

        int [] scores= {10,20,30,40,50};
        //int[] scores2 = new int []{10,20,30,40,50};
        System.out.println(Arrays.toString(scores));
        //System.out.println(Arrays.toString(scores2));

        System.out.println("-----------------------MultiDimensional Array------------------- ");
        int [][] arr2D = {};// for 1-D Array
        int [][][] arr3D = {};// for 2-D Array

        System.out.println("--------");

        Employee [] employees = {
                new Server("FATA ", 20, 'F', "002", 50.00),
                new Chef("Josh", 32, 'M', "B02", "Head Chef", 70000)};

        System.out.println(Arrays.toString(employees));


    }
}
