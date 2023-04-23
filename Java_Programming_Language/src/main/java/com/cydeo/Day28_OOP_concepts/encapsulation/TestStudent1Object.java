package com.cydeo.Day28_OOP_concepts.encapsulation;

public class TestStudent1Object {
    public static void main(String[] args) {


        Student1 student_1 = new Student1("Hamza", 26, 'M', 'A', "MIT");
        System.out.println(student_1);
        student_1.setSchoolName("Harvard");
        student_1.setGender('M');
        System.out.println(student_1);
    }

}
