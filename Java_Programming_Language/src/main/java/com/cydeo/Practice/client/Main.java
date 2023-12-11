package com.cydeo.Practice.client;

import com.cydeo.Practice.Account;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Client client = new Client(100, "Alli", "123456789");

        accounts.add(new Account(1,1000, 1.5, client ));
        accounts.add(new Account(2,8000, 2.5, client ));
        accounts.add(new Account(3,6000, 3.5, client ));
        accounts.add(new Account(4,41000, 2.5, client ));
        accounts.add(new Account(5,2000, 1.5, client ));

        accounts.get(0).withdraw(400.00);
        accounts.get(0).withdraw(500.00);
        accounts.get(0).deposit(5000.00);
        accounts.get(0).deposit(1000.00);


        accounts.get(1).withdraw(500.00);
        accounts.get(1).deposit(5000.00);
        accounts.get(1).deposit(1000.00);

        System.out.println(accounts.get(0));
    }
}
