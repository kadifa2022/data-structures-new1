package co.cydeo.lab12_array_collection_map.lab11_exception_and_polymorphism.restuarant_task;

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
        Server server = new Server("FATA ", 20, 'F', "002", 50.00);
        Chef chef = new Chef("Josh", 32, 'M', "B02", "Head Chef", 70000);


        Restaurant restaurant = new Restaurant("Josh", "7925 Jones Branch Dr. " ,4.5);

        System.out.println(restaurant);
        // adding employee restaurant and casting employee to Server and chef

        restaurant.hireServer((Server)employee1);
        restaurant.hireChef((Chef)employee2);

        //restaurant.hireChef(employee1);// null pointer exception

       // restaurant.hireChef(((Server) employee1).promoteToChef());


        restaurant.hireServer(server);
        restaurant.hireChef(chef);

        System.out.println(restaurant);
/*
        restaurant.terminateServer("A01");
        restaurant.terminateChef("B02");
        System.out.println(restaurant);

 */

        System.out.println("---------------------------------------");

        for (Chef eachChef : restaurant.getChefs()) {// iterate  each chef array
            System.out.println(eachChef);

        }
        System.out.println("-----------------------------------------------");

        for (Server eachServer : restaurant.getServers()) {
            System.out.println(eachServer);

        }
        System.out.println("--------------------");
        Server s= null;
        Chef c= null;

        restaurant.hireServer(s);
        restaurant.hireChef(c);

        System.out.println(restaurant);// will give us null pointer exception, because we set condition can not be null




    }
}
