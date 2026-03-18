package matcomp.e1.ejerciciosclases.cuaderno2.customer2;

public class Account {
    // Atributos de la cuenta: id, objeto cliente y saldo
    private int id;
    private Customer customer;
    private double balance;

    /** Constructor de cuenta con id, cliente y saldo inicial
     */
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    /** Constructor de cuenta con id y cliente (saldo por defecto 0.0)
     */
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        balance = 0.0;
    }

    // Métodos getter para acceder a los atributos privados
    /** Metodo que devuelve el ID de la cuenta */
    public int getId() {
        return id;
    }

    /** Metodo que devuelve el objeto cliente asociado */
    public Customer getCustomer() {
        return customer;
    }

    /** Metodo que devuelve el saldo actual */
    public double getBalance() {
        return balance;
    }

    /** Metodo que cambia el saldo de la cuenta */
    public void setBalance(double balance) {
        this.balance = balance;
    }


    /** Metodo que pasa la cuenta a texto con formato de dos decimales
     */
    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    /** Metodo para ingresar dinero, devuelve la cuenta para encadenar
     */
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
        return this;    // devuelve la cuenta para encadenar
    }
}
