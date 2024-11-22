package java;


public class main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.exp = 5;

        double salary = emp.calculateSalary();
        System.out.println(salary);
    }
}
