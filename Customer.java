package system.banking;

public class Customer {
    private static int nextAccountNumber = 1;
    private int accountNumber;
    private String name;
    private Account account;

    public Customer(String name) {
        this.name = name;
        this.accountNumber = nextAccountNumber++;
        this.account = new Account();
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
