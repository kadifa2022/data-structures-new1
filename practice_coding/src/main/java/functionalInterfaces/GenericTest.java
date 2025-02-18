package functionalInterfaces;


import java.util.ArrayList;
import java.util.Arrays;

public class GenericTest {
    public static void main(String[] args) {


        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
        Double[] decimals = {1.2, 2.5, 3.5, 4.5, 5.5, 6.5};
        String [] names = {"Java", "Selenium", "SQL", "API", "Wooden Spoon"};

//
//      Generics.printEach(numbers); // called through the static class
//      Generics.printEach(decimals);
//      Generics.printEach(names);

      ArrayList<Integer> score = new ArrayList<>(Arrays.asList(40,50,60,90,80,70));
//      Generics.printEach(score);
      ArrayList<Double> decNumber = new ArrayList<>(Arrays.asList(10.5,20.5,30.5,40.5,5.0,60.5));
//      Generics.printEach(decNumber);


        // Creating  object from the Generic class and will call methods through objects
        Generics<Double > obj = new Generics<>();
        obj.printEach(score);//list
        obj.printEach(decNumber);//list
        obj.printEach(numbers);//array
        obj.printEach(names);//array
        obj.printEach(decimals);//array

        System.out.println("---------------------------");


    }
}
