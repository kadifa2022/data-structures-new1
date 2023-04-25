package com.cydeo.Day28_OOP_concepts.abstraction.cydeoDevStudent;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {//final can not be inherited

    private final String id;//needs to initiation before creating objects
    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage;



    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if(getAge()<18){// if age is set to less than 18
            System.err.println("Cydeo Developer student must be at least 18 years old ");
            System.exit(1);
        }

        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);


    }
    static{
        programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }
    // setter is used to change the value of variable
    // final can't be used setter, because we can't change value
    public void setBatchName(String batchName) {
        if(!(batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev"))){
        }else{//otherwise: if the batch name is invalid
            System.err.println("Invalid batch name" + "\nNo such a batch in Cydeo");
            System.exit(1);
        }
        //this.batchName = batchName;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <=0){
            System.err.println("Invalid batch number: " + batchNumber+ "\nBatch number can not be negative or zero") ;
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    // we override methode only if we need different implementation


    @Override
    public void eat() {

        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking  " + programmingLanguage);

    }

    @Override
    public void sleep() {
        System.out.println(getName() + " does not nee to sleep " + programmingLanguage);
    }

  // breath() if final  and can not be override


    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                " name='" + getName()+ '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}


