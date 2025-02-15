package oop.Encaptulation;

public class Employee {

    private String name;
    private double salary;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;// just resign
    }

    public double getSalary(){
        return salary;
    }



    public void setSalary(int salary){

        if(salary <= 0){
            System.err.println("Invalid Salary: " + salary);
            System.exit(0);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
