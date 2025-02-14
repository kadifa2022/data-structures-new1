package constructor;

public class Employee2 {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


public Employee2(String name, char gender, String jobTitle, double salary){
    this.name = name;
    this.gender = gender;
    this.jobTitle = jobTitle;
    this.salary= salary;



}




    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
