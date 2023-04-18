package com.cydeo.Constructor_Remove_If_Method;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodePractice {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", "Small", 'M', 5, "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", "Large", 'F', 3, "Gold");
        dogs[2].setInfo("Molly", "Beagle", "Medium", 'F', 4, "White");
        dogs[3].setInfo("Oliver", "Bulldog", "Small", 'M', 6, "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", "Large", 'F', 7, "White");
        dogs[5].setInfo("Loki", "Chow Chow", "Small", 'M', 2, "Gold");


        //ArrayList contains all objects of the  Array(because is non-primitive ->from arrayUtility call asList(dogs) (pass the array that you want to convert)
        ArrayList<Dog> smallDogs  = new ArrayList<>(Arrays.asList(dogs));


        smallDogs.removeIf(p->!p.size.equalsIgnoreCase("small"));//to keep small dogs

//
//        for(Dog dog : dogs){
//            if(dog.size.equalsIgnoreCase("Small")){
//                smallDogs.add(dog);
//
//            }
//        }
        System.out.println(smallDogs);

        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));
//        for(Dog dog : dogs){
//            if(dog.age<=4){
//                youngDogs.add(dog);//with loop
//            }
//        }

        youngDogs.removeIf(p->p.age > 4);
        System.out.println(youngDogs);

     //   youngDogs.forEach(p-> System.out.println(p.name));
        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p->p.gender == 'M');
        System.out.println(femaleDogs);
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p->p.gender == 'F');
        System.out.println(maleDogs);


        System.out.println("-----------------------------");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", "Small", 'M', 5, "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", "Large", 'F', 3, "Gold");
        dogs2[2].setInfo("Molly", "Beagle", "Medium", 'F', 4, "White");
        dogs2[3].setInfo("Oliver", "Bulldog", "Small", 'M', 6, "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", "Large", 'F', 7, "White");
        dogs2[5].setInfo("Loki", "Chow Chow", "Small", 'M', 2, "Gold");




        //Array is fixed data and we can't remove objects but you can create new array
        // we can convert array to ArrayList<>

        ArrayList<Dog> list = new ArrayList<>(Arrays.asList(dogs2));

        list.removeIf(p->p.size.equalsIgnoreCase("Small"));//if is string use equalsIgnoreCase()
        dogs2= list.toArray(new Dog[0]);// list.size() can be added instead 0 ->> will include all elements of array
        System.out.println(Arrays.toString(dogs2));



    }
}
/*
1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");
            Note: Dog class is imported from package day17
        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList
            Note: DO NOT use any loops
	    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList
	            Note: DO NOT use any loops
	    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList
	            Note: DO NOT use any loops
	    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList
	            Note: DO NOT use any loops
 */
