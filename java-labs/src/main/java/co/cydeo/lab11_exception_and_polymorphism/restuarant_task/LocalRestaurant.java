package co.cydeo.lab11_exception_and_polymorphism.restuarant_task;

public class LocalRestaurant {

    public static void main(String[] args) {
        Employee employee1 = new Server("Emily", 20, 'F', "001", 50.00);
        System.out.println(employee1);
        employee1.work();

        ((Server) employee1).takeOrder();
        ((Server) employee1).cleanTable();


        Employee employee2 = new Chef("Daniel", 30, 'M', "B001", "Head Chef", 89000);

        employee2.work();
        ((Chef) employee2).makeOrder();
        ((Chef) employee2).washDishes();

        System.out.println("----Rule----");
        //polymorphism does not exist, pre-condition for polymorphism is inheritance
        // no inheritance relationship
        //Restaurant restaurant = new Chef("Daniel", 30, 'M',"B001", "Head Chef", 89000);

        try {
            ((Server) employee2).takeOrder();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------");


        Restaurant restaurant = new Restaurant("Josh", "7925 Jones Branch Dr. " ,4.5);

        System.out.println(restaurant);
        // adding employee restaurant and casting employee to Server and chef
        restaurant.hireServer((Server)employee1);
        restaurant.hireChef((Chef)employee2);

        //restaurant.hireChef(employee1);// null pointer exception

        restaurant.hireChef(((Server) employee1).promoteToChef());

        System.out.println(restaurant);



    }
}
