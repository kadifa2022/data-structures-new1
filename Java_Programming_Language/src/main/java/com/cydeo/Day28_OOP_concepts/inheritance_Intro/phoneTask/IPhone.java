package com.cydeo.Day28_OOP_concepts.inheritance_Intro.phoneTask;

public class IPhone extends Phone{// Iphone relationship is created// iphone is A phone
    // only unique for IPhone
    public static boolean hasApplePay = true;

    //calling constructor  from parent class is MUST and is calling  with SUPER keyword
    //Only constructor can call constructor

    public IPhone(String model, String size, double price, String color){   //brand is unnecessary to pass through constructor we took out//no need additional information
                                                                             //we set Apple -> because for Iphone Apple is brand for all IPhones
        super("Apple", model, size, price, color );                   //calling parent class constructor
    }



    public void faceTime(long phoneNumber){
        System.out.println(getModel()+ " is face timing with " + phoneNumber);

    }
    public void faceTime(String email){
        System.out.println(getModel()+ " is face timing with " + email);

    }

}
