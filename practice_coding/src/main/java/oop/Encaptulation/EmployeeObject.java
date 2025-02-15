package oop.Encaptulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
//        employee1.name ="Josh";
//        employee1.salary =90000;

        employee1.setName("Josh");
        employee1.setSalary(-90000);
        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());

    }
}
