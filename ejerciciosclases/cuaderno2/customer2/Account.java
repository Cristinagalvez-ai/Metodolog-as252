package matcomp.e1.ejerciciosclases.cuaderno2.customer2;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        balance = 0.0;
    }

    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }
    public Account deposit(double amount) {
        balance += amount;
        return this;    // para poder encadenar
    }
    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
        else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
