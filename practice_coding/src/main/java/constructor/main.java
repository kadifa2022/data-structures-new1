package constructor;


public class main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.exp = 5;

        double salary = emp.calculateSalary();
        System.out.println(salary);
      // constructor
        Employee2 emp2 = new Employee2("Monika", 'F', "Developer", 6000);
        Employee2 emp3= new Employee2("Shay", 'M', "QA", 80000);


        System.out.println(emp2);
    }
}
