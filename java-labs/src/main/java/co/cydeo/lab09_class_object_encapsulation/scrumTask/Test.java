package co.cydeo.lab09_class_object_encapsulation.scrumTask;

public class Test {
    public static void main(String[] args) {


        Tester tester1 = new Tester("Hasim", 20, 'M', "001", "QA", 30.00);
        System.out.println(tester1);
        tester1.testing();


        Developer developer = new Developer("Mila", 30,'F',"C002", "Back-end Developer", 20, "Java");
        System.out.println(developer);
        developer.coding();
        developer.fixingBug();
    }
}
