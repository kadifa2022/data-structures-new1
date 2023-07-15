package co.cydeo.lab11_exception_and_polymorphism.restuarant_task;

public class Employee {

    private String name;
    private int age;
    private final char gender;
    private final String id;
    private String jobTitle;
    private double salary;


    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        if(!(gender=='F' || gender=='M')){
            throw new NoSuchPersonException("Gender has to be either 'M' or 'F' ");
        }
        this.gender = gender;

        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle==null || jobTitle.isEmpty()) {
            throw new NoSuchJobException("Job title  can't be null or empty");
        }
        this.jobTitle = jobTitle;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty()){
            throw new NoSuchPersonException("Name can't be null or empty");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new NoSuchJobException("Age can not be negative " + age);

        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            throw new NoSuchJobException("Salary can not be negative : " + salary);
        }
        this.salary = salary;
    }
}
