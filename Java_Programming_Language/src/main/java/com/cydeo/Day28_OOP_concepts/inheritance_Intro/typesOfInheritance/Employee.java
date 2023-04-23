package com.cydeo.Day28_OOP_concepts.inheritance_Intro.typesOfInheritance;

import java.time.LocalDate;


public class Employee extends Person{
    private String employeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary) {
        super(name, gender, DOB);
        setEmployeeId(employeeId);//additional fields
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public void work() {
        System.out.println(getName() + "is working");


    }

}
