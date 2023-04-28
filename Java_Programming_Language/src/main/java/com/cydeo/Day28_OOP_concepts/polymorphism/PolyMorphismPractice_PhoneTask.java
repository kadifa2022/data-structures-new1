package com.cydeo.Day28_OOP_concepts.polymorphism;

import com.cydeo.Day28_OOP_concepts.inheritance.phoneTask.IPhone;
import com.cydeo.Day28_OOP_concepts.inheritance.phoneTask.Nokia;
import com.cydeo.Day28_OOP_concepts.inheritance.phoneTask.Phone;
import com.cydeo.Day28_OOP_concepts.inheritance.phoneTask.Samsung;

public class PolyMorphismPractice_PhoneTask {
    public static void main(String[] args) {
     //phone object reference type

        //== using this operator is comparing the objects from memory locations(is not wise to use to compare string Muhtar told us before)
        //.equals() ->

        // casting: converting one type to another type data
        //2 types of the casting
        //1. primitive type casting -> must happen between primitives
                      //-implicit pritive type : casting smaller primitive type to larger primitive types
//        int a = 100;
//        double b = a;//implicitly casted to double
//
                    //- explicit primitive type casting: casting larger primitive type to smaller primitive types
//       long a = 100;
//       short b=( short) a;

        //2. Reference Type casting
        // THERE MUST BE IS A  INHERITANCE   RELATIONSHIP BETWEEN THE OBJECTS

        Phone[] phones = {
                new IPhone("Iphone 11 Pro", "Large", 9000,"Black"),
                new IPhone("Iphone 12 Pro Max", "Large", 1200,"Black"),
                new IPhone("Iphone 9", "Medium", 900,"Gold"),
                new Samsung("Galaxy S19", "Medium", 700,"Pink"),
                new Samsung("Galaxy S20", "Large", 850,"Silver"),
                new Samsung("Galaxy S21", "Large", 950,"White" ),
                new Nokia("XR20", "Small", 900,"Pink"),
                new Nokia("G10", "Medium", 560,"Pink"),
                new Nokia("G50", "Large", 350,"Silver"),
                new IPhone("Iphone 12 Pro", "Large", 555,"Black"),
                new IPhone("Iphone 11 Pro Max", "Large", 1100,"Silver"),
                new Samsung("Galaxy S18", "Medium", 750,"White"),
                new Samsung("Galaxy S17", "Large", 650,"Silver"),
                new Nokia("G10", "Medium", 99,"Black"),
                new IPhone("Iphone 6", "Smalle", 400,"Gold"),
                new IPhone("Iphone 7", "Smalle", 500,"White")
        };

        //model - color-price
        for(Phone eachPhone :phones){
            System.out.println(eachPhone.getModel()+" - "+eachPhone.getColor()+" - "+eachPhone.getPrice());
        }
        System.out.println("-------------------------------------------------------------------------");



        // instanceOf -keyword-> must have relationship
        int countIphone= 0;
        int countSamsung=0;
        for(Phone each: phones){//loop for each object
            if(each instanceof IPhone){// if the phone is Iphone
                countIphone++;
            }
            if(each instanceof Samsung){// if the phone is Samsung
                countSamsung++;
            }

//            if(each instanceof Toyota){ ->no relationship  }->  in  order to specify object use (instanceOf)
        }

        for(Phone each: phones){
            if(each instanceof IPhone || each instanceof Samsung ){// if the phone is Iphone or samsung
                if(each.getPrice()>=700){// check the phones by price
                    System.out.println(each.getModel());// display model of the

                }

            }
        }





    }

}
/*
1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones? // int CountIphone = 0;

	3. How many Samsung in the array of phones?// int countSamsung = 0;

	4. Display the models of Iphones and samsung that has the price of 700 or greater


 */