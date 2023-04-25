package com.cydeo.Day28_OOP_concepts.inheritance.personTask_finalKeyword;

import java.time.LocalDate;

public class Employee extends Person{


    private String jobTitle;
    private double salary;

    public Employee(String name, char gender,  LocalDate dateOfBirth, String jobTitle, double salary) {
        super(name, gender, dateOfBirth);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is teaching");

    }

    @Override
    public String toString() {// to override toSting method copy/paste from super class and add get
        return "Employee{" +
                " name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
