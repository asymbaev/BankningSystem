package system.banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private static Bank instance;
    private List<Customer> customers;

    private Bank() {
        customers = new ArrayList<>();
    }

    public static Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }

    public Customer createCustomer(String name) {
        Customer customer = new Customer(name);
        customers.add(customer);
        return customer;
    }

    public void performTransaction(Customer customer, double amount, TransactionType transactionType) {
        if (transactionType == TransactionType.DEPOSIT) {
            customer.getAccount().deposit(amount);
        } else if (transactionType == TransactionType.WITHDRAW) {
            customer.getAccount().withdraw(amount);
        }
    }

    public static double askAmount(String action) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to " + action + ": $");
        return scanner.nextDouble();
    }
}

enum TransactionType {
    DEPOSIT, WITHDRAW
}
