package co.cydeo.lab11_exception_and_polymorphism.restuarant_task;

public class Chef extends Employee{

    public Chef(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Chef", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is cooking ");

    }

    public void makeOrder(){
        System.out.println(getName() + " is making order");
    }

    public void washDishes(){
        System.out.println(getName() + "is washing dishes");
    }

}
