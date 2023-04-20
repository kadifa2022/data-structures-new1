package com.cydeo.Constructor_Remove_If_Method.studentTask_constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {//StudentsGroup HAS A Student(relationship)

    public String  groupName;
    public int groupId;
                        // Student is data type // students are instance variable
    public ArrayList<Student> students = new ArrayList<>();//instants variable


    public StudentsGroup(String groupName, int groupId) {// creates the StudentsGroup object by setting the groupName and GroupId
        this.groupName = groupName;
        this.groupId = groupId;
        //students = new ArrayList<>(): // size 0

    }
        //students = new ArrayList<>();// on beginning size is 0
        //this method does:Takes one student object, and adds it to the arraylist of students
        public void addStudent(Student student){// instance
        students.add(student);
    }
        // Takes one array of students, and add the array of the students to the arraylist to the students
    public void addStudent(Student [] students){
        this.students.addAll(Arrays.asList(students));

    }
    //This method does: takes name, age, gender, id of studentInfo and creates student object by using the given info, and add's the students object to the arrayList
            public void addStudent(String name, int age, char gender, String id){
            //Student student= new Student(name, age, gender, id);//two ways to add student object
            students.add(new Student(name, age, gender, id));

    }
    //this methode does: Takes the id and then removes the student object with specific id from arrayList
    public void removeStudent(String id){
        students.removeIf(p->p.id.equals(id));
            }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +//arrayList of the students with size()
                '}';
    }
}
/*
2. Create a custom class named StudentsGroup
            Attributes:
                groupName
                groupId
                students (ArrayList<Students>)

            Add a constructor that can set the groupId and groupName
                    initialize students arraylist in the constructor's body

            Methods:
                addStudent(Student): adds the specified student to the students arrayList
                removeStudent(id): removes the student with the specified id from the students arraylist
                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement


 */