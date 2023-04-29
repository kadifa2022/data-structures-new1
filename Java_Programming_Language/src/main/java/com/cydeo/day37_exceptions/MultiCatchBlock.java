package com.cydeo.day37_exceptions;

import com.cydeo.Day28_OOP_concepts.abstraction.TransportationTask.Car;

public class MultiCatchBlock {
    public static void main(String [] args){

        Car car = null;
        try{
            car.drive();
        }catch (ArithmeticException e){//null pointer exception
            System.out.println("First catch Block");
            e.printStackTrace();
        }catch(ClassCastException e){
            System.out.println("Second catch  Block");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();

        }catch(IndexOutOfBoundsException e){
            System.out.println("Fourth catch lock");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch b lock");
            e.printStackTrace();
        }
        System.out.println("Program1 ended");
    }
}
