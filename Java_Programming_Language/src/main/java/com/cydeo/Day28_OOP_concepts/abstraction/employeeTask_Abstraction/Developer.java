package com.cydeo.Day28_OOP_concepts.abstraction.employeeTask_Abstraction;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding in " + programmingLanguage);

    }

    @Override
    public String toString() {// one way of calling toString() with super.
        return super.toString().replace("}", "")+
                ", programmingLanguage=" + programmingLanguage + "}";


      /*  return "Developer{" + // another way
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id='" + getId() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';

                */
    }

}
