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

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(3);
        Circle c3 = new Circle(4);
        Circle c4 = new Circle(6);
        System.out.println(c1.pi);
        System.out.println(c2.pi);
        System.out.println(c3.pi);
        System.out.println(c4.pi);



        Circle.printPI();
    }
}
