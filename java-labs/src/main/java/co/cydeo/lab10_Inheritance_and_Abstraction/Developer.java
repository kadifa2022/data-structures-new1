package co.cydeo.lab10_Inheritance_and_Abstraction;

public  class Developer extends Employee implements ScrumMember, WorkFromHome{

    public Developer(String name, int age, char gender, String id, String jobTitle, String salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ "is coding");

    }
    public void fixBug(){
        System.out.println(getName() + "is fixing the bug");
    }


    @Override
    public void dailyStandUp() {
        System.out.println(" planning ");

    }

    @Override
    public void springPlanning() {
        System.out.println("Planning");

    }

    @Override
    public void workFromHome() {
        System.out.println();


    }
}
