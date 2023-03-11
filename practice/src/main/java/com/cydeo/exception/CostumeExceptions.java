package com.cydeo.exception;
class CustomUncheckedException extends RuntimeException{

}
class CustomCheckedException extends Exception{

}

public class CostumeExceptions {
    public static void main(String[] args) {
        try{
            throw new CustomCheckedException();
        }catch (CustomCheckedException e){
            e.printStackTrace();
        }
        System.out.println("----------------------------");
        throw  new CustomUncheckedException();
    }
}
