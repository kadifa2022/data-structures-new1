package com.cydeo.Constructor_Remove_If_Method.studentTask_constructor;

public class TestObjects {

    public static void main(String[] args) {

        //create 5 objects
        Student student1= new Student("Yusuf", 21, 'M', "A16");
        Student student2= new Student("Glenio", 24, 'M', "B34");
        Student student3= new Student("Sumeyye", 22, 'F', "C56");
        Student student4= new Student("Mehmet", 25, 'M', "D43");
        Student student5= new Student("Sebastian", 23, 'M', "E27");
         Student [] students = {student2, student3, student4, student5};

        StudentsGroup group1 = new StudentsGroup("Java Trutles", 1);
        group1.addStudent(student1);
        group1.addStudent(students);
        group1.addStudent("Khashayar", 34,'M',"F35");
        System.out.println(group1);

        group1.removeStudent("D43");
        group1.removeStudent("E27");
        System.out.println(group1);
        for (Student each :group1.students){//
            System.out.println(each.name + ": " + each.id);
        }

        System.out.println("-----------------------------------------------");

        StudentsGroup group2 = new StudentsGroup("Java Turtles", 1);
        StudentsGroup group3 = new StudentsGroup("Java Turtles", 1);
        StudentsGroup group4 = new StudentsGroup("Java Turtles", 1);
        StudentsGroup[] groups = {group1,group2, group3, group4};



    }
}
