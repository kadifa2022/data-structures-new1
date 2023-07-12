package co.cydeo.lab7_ClassAndObject;

public class TestCarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        /*
        car1.brand = "BMW";
        car1.year =2022;
        car1.model="x6";
        car1.color = "Blue";
        car1.price= 50000;

         */// calling without setInfo ()
        car1.setInfo("BMW", "X6", 2022, "Red", 50000);


        Car car2 = new Car();
        /*
        car2.brand = "Nissan";
        car2.year =2021;
        car2.model="x5";
        car2.color = "Red";
        car2.price= 29000;

         */
        car2.setInfo("Audi", "q4", 2021, "Black", 39000);

        Car car3 = new Car();
        car3.setInfo("Honda", "civic", 2019, "Blue", 40000);



        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car1.drive();



    }
}
