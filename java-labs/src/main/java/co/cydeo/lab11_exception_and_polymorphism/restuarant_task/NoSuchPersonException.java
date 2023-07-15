package co.cydeo.lab11_exception_and_polymorphism.restuarant_task;

public class NoSuchPersonException extends RuntimeException{

    public NoSuchPersonException(String message) {
        super(message);
    }

}
