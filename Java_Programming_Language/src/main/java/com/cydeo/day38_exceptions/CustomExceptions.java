package com.cydeo.day38_exceptions;

class CustomCheckedException extends Exception{//for checked exception

}
class customUncheckedException extends RuntimeException{// for unchecked exceptions

}

public class CustomExceptions {

    public static void main(String[] args) {

        try{
            throw  new CustomCheckedException();

        }catch (CustomCheckedException e){
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------" );

    }
}
