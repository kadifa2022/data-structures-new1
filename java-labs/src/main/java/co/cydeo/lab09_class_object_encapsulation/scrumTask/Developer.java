package co.cydeo.lab09_class_object_encapsulation.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double hourlyRate;
    private String programmingLanguage;



    public String getName(){//just for read only
        return name;
    }
    public void setName(String name){
        if(name ==null || name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name " + name);
            System.exit(1);
        }
        this.name =name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18){//condition for age
            System.err.println("Invalid age for the tester: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F') ){
            System.err.println("Invalid gender for tester :" + gender);

        }
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle ==null || jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Invalid job title");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 ){
            System.err.println("Hourly rate of tester can not be negative");
            System.exit(1);// determinate program with exist method

        }
        this.hourlyRate = hourlyRate;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        ArrayList<String> programmingLanguages= new ArrayList<>();
        programmingLanguages.addAll(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));
        if(!programmingLanguages.contains(programmingLanguage)){
            System.err.println("Invalid programming language: " + programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }




    public double getSalary(){
        return hourlyRate * 40 *52;
    }
    public void fixingBug(){
        System.out.println(name+ "Programmer is fixingBugs in Java application");
    }














}


/*
2. create a class named Developer

     Attributes:
     Conditions for setting the fields
     1.name can not be set to null/empty/blank
     2.age can not be less than 18
     3.gender only can be set to 'M' or 'F'
     5.jobTitle can not be set to null/empty/blank
     6.hourlyRate can not be negative
     7.programingLanguage must be one of those programing language:
           languages={"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}
    Method:
    getSalary():returns the annual salary
    coding()
    fixingBug()
    toString()






 */