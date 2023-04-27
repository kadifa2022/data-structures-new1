package com.cydeo.Day28_OOP_concepts.polymorphism;

import com.cydeo.Day28_OOP_concepts.abstraction.TransportationTask.Tesla;
import com.cydeo.Day28_OOP_concepts.abstraction.employeeTask_Abstraction.*;

public class PolymorphismPractice_InstanceOf {
    public static void main(String[] args) {


        Employee[] employees = new Employee[]{
                new Teacher ("Daniel", 54, 'M', "A1", "Math Teacher", 85000),
                new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28, 'M', "A03", "SDET", 120000),
                new Developer("Yulia", 23, 'F', "A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M', "A05", "SDET", 105000),
                new Developer("Gulistan", 26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora", 28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Developer("Diana", 29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana", 25, 'F', "A09", "SDET", 130000),
                new Developer("Alena", 26, 'F', "A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur", 29, 'M', "A11", "SDET", 115000),
                new Developer("Hasan", 26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia", 24, 'F', "A13", "QE", 125000),
                new Developer("Ermek", 26, 'M', "A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar", 30, 'M', "A15", "SDET", 105000),
        };

        //1. Print the name and job Title from every Employee
        //iterate []
        for(Employee each : employees){ // this is also Polymorphism
            // if is private we call gerName(), getJobTitle
            System.out.println(each.getName()+ " : " + each.getJobTitle());
        }

        System.out.println("----------------------------------------------------------");
        int countDeveloper=0,
                countTester=0,
                countDriver=0,
                countTeacher=0;


        for(Employee each :employees){ // instance of
            if(each instanceof Developer){//if the employee is Developer
                countDeveloper++;
            }else if(each instanceof Tester){// if the employee is tester
                countTester++;
            }else if (each instanceof Teacher){//if the employee is Teacher
                countTeacher++;
            }else
                countDriver++;//drivers

        }
        System.out.println("countDevelopers=" + countDeveloper);
        System.out.println("countTesters =" + countTester);
        System.out.println("countTeachers= " + countTeacher);
        System.out.println("countDrivers=" + countDriver);

        System.out.println("-------------------------------------------------------");

    }



}
