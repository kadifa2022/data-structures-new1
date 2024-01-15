package co.cydeo.lab12_array_collection_map.lab11_exception_and_polymorphism;

import java.io.FileInputStream;

public class ExceptionPractice {

    public static void main(String[] args) {
        String str = null;
        try {
            String result = str.repeat(3);

            System.out.println(result);
            System.out.println("Try block");

        } catch (NullPointerException e) {// catch block is taking over

            e.printStackTrace();
            System.out.println("catch Block");
            str = "Java";// as long is not null will be executed
            String result = str.repeat(3);
            System.out.println(result);
        }
        System.out.println("-------------------------------");

    }
}