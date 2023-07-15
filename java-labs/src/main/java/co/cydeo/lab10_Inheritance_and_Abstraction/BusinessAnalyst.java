package co.cydeo.lab10_Inheritance_and_Abstraction;

public final class BusinessAnalyst extends Employee implements ScrumMember ,WorkFromHome{

    public BusinessAnalyst(String name, int age, char gender, String id,  String salary) {
        super(name, age, gender, id, "Business Analyst", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ "gathering requirement documents");
    }

    public void analyze(){
        System.out.println(getName() + "is analyzing the requirements");
    }


    @Override
    public void dailyStandUp() {
        System.out.println();

    }



    @Override
    public void springPlanning() {
        System.out.println();

    }

    @Override
    public void workFromHome() {
        System.out.println();

    }

}
