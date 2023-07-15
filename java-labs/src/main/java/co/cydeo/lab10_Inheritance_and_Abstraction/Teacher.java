package co.cydeo.lab10_Inheritance_and_Abstraction;

public final class Teacher extends Employee implements WorkFromHome{

    public Teacher(String name, int age, char gender, String id, String jobTitle, String salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + "is preparing class materials");

    }
    public void teach(){
        System.out.println(getName() + " is teaching");
    }

    @Override
    public void workFromHome() {
        System.out.println(getName()+ " is teaching from home");

    }
}
