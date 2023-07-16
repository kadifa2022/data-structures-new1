package co.cydeo.lab11_exception_and_polymorphism.restuarant_task;

public class LocalRestaurant {

    public static void main(String[] args) {
        Employee employee1 = new Server("Emily",20,'F',"001", 50.00);
        System.out.println(employee1);
        employee1.work();

        ((Server) employee1).takeOrder();
        ((Server) employee1).cleanTable();


        Employee employee2= new Chef("Daniel" , 30, 'M', "B001", "Head Chef", 89000);

        employee2.work();
        ((Chef) employee2).makeOrder();
        ((Chef) employee2).washDishes();


    }
}
