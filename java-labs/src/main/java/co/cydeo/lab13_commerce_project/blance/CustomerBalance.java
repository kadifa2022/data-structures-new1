package co.cydeo.lab13_commerce_project.blance;

import java.util.UUID;

public class CustomerBalance extends Balance{


    public CustomerBalance(UUID customerId, Double balance) {
        super(customerId, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {
        setBalance(getBalance() + additionalBalance);
        return getBalance();
    }
}