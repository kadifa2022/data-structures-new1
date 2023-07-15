package co.cydeo.lab10_Inheritance_and_Abstraction;

public final class ScrumMaster extends Employee implements ScrumMember, WorkFromHome{

    public ScrumMaster(String name, int age, char gender, String id,  String salary) {
        super(name, age, gender, id, "Scrum Master", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + "is scheduling meetings");

    }

    public void coaching(){
        System.out.println(getName() + "is coaching");
    }

    @Override
    public void dailyStandUp() {
        System.out.println(getName() + " ");

    }


    @Override
    public void springPlanning() {
        System.out.println(getName() + " ");

    }

    @Override
    public void workFromHome() {
        System.out.println(getName() + "is working from home ");

    }
}
