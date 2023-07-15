package co.cydeo.lab10_Inheritance_and_Abstraction;

public final  class Tester extends Employee implements ScrumMember, WorkFromHome{


    public Tester(String name, int age, char gender, String id, String jobTitle, String salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + "is testing the application");

    }
    public void createTicket(){
        System.out.println(getName()+ " is creating tickets");
    }

    @Override
    public void dailyStandUp() {
        System.out.println(getName() + " is having 5 min meeting ");

    }

    @Override
    public void springPlanning() {
        System.out.println(getName() + "Planning springs");

    }

    @Override
    public void workFromHome() {
        System.out.println(getName() + " is working from home");

    }
}
