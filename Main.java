package system.banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        Scanner scanner = new Scanner(System.in);javac com/banking/Main.java

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        Customer customer = bank.createCustomer(customerName);

        double depositAmount = Bank.askAmount("deposit");
        bank.performTransaction(customer, depositAmount, TransactionType.DEPOSIT);

        double withdrawAmount = Bank.askAmount("withdraw");
        bank.performTransaction(customer, withdrawAmount, TransactionType.WITHDRAW);

        System.out.println(customer);
        System.out.println("Final balance: $" + customer.getAccount().getBalance());
    }
}
