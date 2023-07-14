package co.cydeo.lab09_class_object_encapsulation.scrumTask;

public class Tester {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double hourlyRate;

    public Tester(String name, int age, char gender, String id, String jobTitle, double hourlyRate) {
        setName( name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setHourlyRate(hourlyRate);
    }

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

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
/*
1. create a class named Tester
    Variables:
    name, age , gender, employeeId, jobTitle, hourlyRate

    Encapsulate all fields
    Conditions for setter the fields
    1.name can not be set to null/ empty/ blank
    2. age can not be less than 18
    3.gender can only be set to 'M' or 'F'
    4. jobTitle can not be set to null/empty/blank
    5. hourlyRate can not be negative

    add constructor that can set all the fields when an object is created

    Methods:
    getSalary(); returns the annual salary
    testing()
    toString()

    */