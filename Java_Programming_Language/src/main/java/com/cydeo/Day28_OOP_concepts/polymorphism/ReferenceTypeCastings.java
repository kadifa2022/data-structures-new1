package com.cydeo.Day28_OOP_concepts.polymorphism;


import com.cydeo.Day28_OOP_concepts.abstraction.TransportationTask.AutoPilot;
import com.cydeo.Day28_OOP_concepts.abstraction.TransportationTask.Electric;
import com.cydeo.Day28_OOP_concepts.abstraction.TransportationTask.Tesla;
import com.cydeo.Day28_OOP_concepts.abstraction.employeeTask_Abstraction.*;
import com.cydeo.Day28_OOP_concepts.inheritance.animalTask.Animal;
import com.cydeo.Day28_OOP_concepts.inheritance.animalTask.Dog;

import com.cydeo.Day28_OOP_concepts.inheritance.phoneTask.Nokia;
import com.cydeo.Day28_OOP_concepts.inheritance.phoneTask.Phone;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

       Dog dog = new Dog();

        //Cat cat = new Dog();

        Animal animal = (Animal) new Dog();// implicitly done UPCASTING

        // Down casting:-> casting the larger reference type to (super type) to smaller reference type (sub type)
        // we need down casting to achieve polymorphism
        //reference type can be PARENT CLASS OR INTERFACE
        //Reason of down casting:?
        //1.  Reference type decides what is accessible.
        //2. Object type decides which implementation of the method to be executed when the method id called.


        Animal animal1= new Dog();// up casting -> Polymorphism
        animal1.setInfo("Max", "Hussky", 'M',4,"Large","White");

     animal1.eat();
     animal1.drink();
     animal1.sleep();
    // animal1.bark();this method is down casted
        ( (Dog)animal1 ).bark();// without down casting can't call bark()


//        Dog dog1 = (Dog)animal1;//down casting
//        dog1.bark();//
          // animal1 is reference to dog object and can't be casted to cat no relationship
      // ( (Cat) animal1).scratch();//no IS  A relationship and "classCastException"

        System.out.println("------------------------------------------------");

        Phone phone  = new Nokia("XR20", "Small", 350, "Blue");

        phone.call(911);
        phone.text(1234567);
        ( (Nokia)phone).selfDefense(); // for the method that is only uniq for the object type we need to down casted

        //((IPhone) phone).faceTime(12354444);// nokia can't convert to iphone, because there is no A relationship

        ((Nokia) phone).selfDefense();

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 90000,"Java");
        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());// casted down unique method for developer

       // Tester tester  = (Tester)employee;// can't be Tester converted to developer NO IS A Relationship "classCastException"
        //IF IS NO DOWN CASTING  -> NO ACCESSING  METHODS  OBJECT TYPES

        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);
        electric.charge();
        ((Tesla)electric).selfDrive();// casted down -> selfDrive()is coming from Tesla class(unique)

        ( (AutoPilot)electric).selfDrive();
        System.out.println("-----------------------------------------------");

        Employee employee1= new Teacher("Daniel", 54, 'M', "A1", "Math Teacher", 85000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 90000,"Java");
        Employee employee3 = new Driver("Ilfo", 50, 'M', "D2","Truck driver",80000);
        Employee employee4 = new Tester("Milojko", 30, 'M',"C3","Tester", 93000);
        // object type decides which implementation will be executed
        employee1.work();//teacher
        employee2.work();// developer
        employee3.work();// driver
        employee4.work();// tester




















    }
}
