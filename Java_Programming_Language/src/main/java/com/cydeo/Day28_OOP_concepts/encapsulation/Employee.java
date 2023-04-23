package com.cydeo.Day28_OOP_concepts.encapsulation;

public class Employee {

    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Employee name can not be empty and blank");
        System.exit(1);//code status
        }
        this.name = name;
    }

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("Salary can not be negative:" +salary);
            System.exit(1);

        }
        this.salary = salary;
    }
}
