package co.cydeo.lab11_exception_and_polymorphism.restuarant_task;

public class NoSuchJobException extends RuntimeException{
    public NoSuchJobException(String exceptionMsg){
        super(exceptionMsg);
    }

    public static void main(String[] args) {

        //throw new RuntimeException("Something went wrong");

       // throw new NoSuchJobException("Invalid Job");
    }


}
