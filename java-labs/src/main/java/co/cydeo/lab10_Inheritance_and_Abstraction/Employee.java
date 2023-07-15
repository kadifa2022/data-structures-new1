package co.cydeo.lab10_Inheritance_and_Abstraction;

public abstract class  Employee extends Person{// meant to be inherited

    private final String id;
    private String jobTitle;
    private String salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, String salary) {
        super(name, age, gender);
        this.id = id;// final
        setJobTitle(jobTitle);
        setSalary(salary);

    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    public abstract void work();



    @Override
    public String toString() {
        return super.toString().replace("}", "") +
               ", id =" + id +
                ", jobTitle=" + jobTitle +
                ", salary=" + salary +
                '}';
    }
}





/*
Create the subclass of Person named Employee
        Extra variables:
        id, jobTitle, salary

        extra Methods:
        work(), (abstract)
        override the toString() to include id, jobTitle, salary


 */