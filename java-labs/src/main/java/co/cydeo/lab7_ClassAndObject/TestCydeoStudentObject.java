package co.cydeo.lab7_ClassAndObject;

public class TestCydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent1= new CydeoStudent();
        cydeoStudent1.setInfo("Naran", 30, 'M', true,true, "Java developer batch 1 ", 001, "Java");
        System.out.println(cydeoStudent1);

        CydeoStudent cydeoStudent2 = new CydeoStudent();
        cydeoStudent2.setInfo("Vasyl", 24, 'M', true, false, "Java developer batch 1", 003, "Java");
        System.out.println(cydeoStudent2);

        CydeoStudent cydeoStudent3 = new CydeoStudent();
        cydeoStudent3.setInfo("Daniela", 42, 'F', true, false, "Java developer batch 1", 001, "Java");
        System.out.println(cydeoStudent3);
    }
}
