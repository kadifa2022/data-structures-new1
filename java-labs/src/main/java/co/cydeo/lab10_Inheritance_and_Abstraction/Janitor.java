package co.cydeo.lab10_Inheritance_and_Abstraction;

public  final class Janitor extends Employee{

    public Janitor(String name, int age, char gender, String id,  String salary) {
        super(name, age, gender, id, "Janitor", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ "is cleaning the building");

    }
}
