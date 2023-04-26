package com.cydeo.Day28_OOP_concepts.abstraction.employeeTask_Abstraction;

public class TestEmployeeObjects {

    public static void main(String[] args) {
        // We can't create object from an Abstract/super/parent  class, Object Must be created from a concrete class
        //Employee employee = new Employee("Daniel", 54, 'M', "A1", "SDET", 85000);

        Teacher teacher= new Teacher("Daniel", 54, 'M', "A1", "Math Teacher", 85000);

        Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 90000,"Java");
        Driver driver = new Driver("Ilfo", 50, 'M', "D2","Truck driver",80000);
        Tester tester = new Tester("Milojko", 30, 'M',"C3","Tester", 93000);


        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);
        System.out.println(tester);
        System.out.println("----------------------------------------------------");
        developer.work();
        tester.work();
        teacher.work();
        driver.work();
    }
}