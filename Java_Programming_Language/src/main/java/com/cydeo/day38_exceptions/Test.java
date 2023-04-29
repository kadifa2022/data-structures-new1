package com.cydeo.day38_exceptions;

import com.cydeo.utility.Library;

public class Test {//customized method from utility_ library class

    public static void main(String[] args) {
        System.out.println("Hello Cydeo");
        //Thread.sleep(3500);
        // call customized sleep methode from class/Library name
        // now main method is responsible to handler exception(if is throws exception)
        // we change custom class exception to try/catch _to handle exception permanently
        Library.sleep(3.5);
        System.out.println("How are you?");
    }







}
