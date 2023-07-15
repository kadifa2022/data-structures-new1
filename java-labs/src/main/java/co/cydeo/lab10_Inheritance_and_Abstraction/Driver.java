package co.cydeo.lab10_Inheritance_and_Abstraction;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, String id, String jobTitle, String salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + "is driving");

    }

    public void drive(){
        work();
    }

}
