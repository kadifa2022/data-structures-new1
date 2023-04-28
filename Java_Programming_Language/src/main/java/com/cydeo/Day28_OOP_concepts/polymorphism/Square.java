package com.cydeo.Day28_OOP_concepts.polymorphism;

public class Square {

    // for 2 square to be equal we need to compare sides
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Square)){
            System.err.println("Invalid Object, Object must be square");
            System.exit(1);
        }
            if(side == ( (Square)obj).side){// == using for compare two object
                return true;

        }
            return false;

    }
}
