package com.cydeo.utility;
import com.cydeo.Day28_OOP_concepts.inheritance.ProtectedAccessModifier;

public class Test3 extends ProtectedAccessModifier{


    public static void main(String[] args) {

        System.out.println(ProtectedAccessModifier.a);//static variable a
        ProtectedAccessModifier.methodA();//static method1
        // void -> for void we don't put print statement
    }
}
