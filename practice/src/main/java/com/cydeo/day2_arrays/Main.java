package com.cydeo.day2_arrays;





import java.util.Arrays;

public class Main {

    public static void main(String[] args) {//dynamic array
//        //two ways of building array
//
//        int [] numbers={10,20,30};
//        System.out.println(numbers.length);
//
//
//        int[] num= new int[3];
//        num[0]=10;
//        num[1]=20;
//        num[2]=30;
//        System.out.println(Arrays.toString(num));
        Array numbers= new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
     //   numbers.removeAt(3);
        System.out.println(numbers.indexOf(10));//search methode


        numbers.print();




    }
}
