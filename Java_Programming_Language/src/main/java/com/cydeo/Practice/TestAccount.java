package com.cydeo.Practice;

import com.cydeo.Practice.client.Client;

public class TestAccount {
    public static void main(String[] args) {


        Account account = new Account(1,5000,2.5,
                new Client(2,"Malik","5222222222222"));

        if(account.withdraw(250))
            System.out.println("Withdraw successful");
        else
            System.out.println("Withdraw not successful");

        account.deposit(3000);
        System.out.println(account.getId() + " " +
                account.getBalance() + " " +
                account.getAnnualInterestRate() + " " + account.getDateCreated());
    }
}