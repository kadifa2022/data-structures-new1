package co.cydeo.lab11_exception_and_polymorphism.restuarant_task;

public class Server extends Employee{

    public Server(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Server ", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + "is serving the customers");
    }

    public void takeOrder(){
        System.out.println(getName() + " is taking customers order");
    }

    public void cleanTable(){
        System.out.println(getName()+ "is cleaning tables");
    }
    public Chef promoteToChef(){
        return new Chef(getName(), getAge(),getGender(),getId(),"Head Chef", getSalary());

    }
}
