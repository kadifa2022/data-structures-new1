package co.cydeo.lab13_commerce_project;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public static void createCustomer(){//sample data
        Address address1Customer1 = new Address("314" , "Charing Ln.","Suite 200", "2290", "VA");
        Address address2Customer1 = new Address("310" , "C Ln.","Suite 201", "2290", "MO");
        Address address1Customer2 = new Address("315" , "Broadway Ln.","Suite 202", "2290", "MI");

        List<Address> customer1AddressList = new ArrayList<>();
        customer1AddressList.add(address1Customer1);
        customer1AddressList.add(address2Customer1);

        Customer customer1 = new Customer(UUID.randomUUID(), "Ozzy", "ozzy@gmail.com", customer1AddressList);
        Customer customer2 = new Customer(UUID.randomUUID(), "Mke", "ozzy@gmail.com");
       // Customer customer3 = new Customer(UUID.randomUUID(), "Ozzy", "ozzy@gmail.com", customer1AddressList);

        StaticConstants_MyDataBase.CUSTOMER_LIST.add(customer1);
        StaticConstants_MyDataBase.CUSTOMER_LIST.add(customer2);
    }




}
