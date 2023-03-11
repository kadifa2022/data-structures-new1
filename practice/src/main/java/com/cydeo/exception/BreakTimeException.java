package com.cydeo.exception;

public class BreakTimeException extends RuntimeException {
    public static void main(String[] args) {

    }

    public BreakTimeException() { super("It's break time");}
    public BreakTimeException(String message){super(message);}
}
