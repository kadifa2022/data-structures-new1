package co.cydeo.lab7_ClassAndObject;

public class TestAddressObject {

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.setInfo("1234a", "Calley Dr.", "New York", "Virginia", "1234a2");
        System.out.println(address1);

        Address address2 = new Address();
        address2.setInfo("5555m", "Brush Dr.", "Saint Louis", "MO", "1234a2");
        System.out.println(address2);

        new Address();// NO reference eligible for Garbage Collector with finalized()

    }


}
