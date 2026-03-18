package matcomp.e1.ejerciciosclases.cuaderno1;

public class Account {
    private String id;
    private String name;
    private int balance;

    /** Constructor que crea una cuenta con un id y nombre dados
     */
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;
    }

    /** Constructor que crea una cuenta con el id, nombre y balance dados
     */
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    /** Metodo que devuelve id
     */
    public String getId() {
        return id;
    }

    /** Metodo que devuelve el nombre
     */
    public String getName() {
        return name;
    }

    /** Metodo que devuelve el balance
     */
    public int getBalance() {
        return balance;
    }

    /** Metodo que crea un credito con la cuenta dada
     */
    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }

    /** Metodo que crea un débito con la cuenta dada
     */
    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;}
        else {
            System.out.println("Amount exceeded balance");}
        return balance;
    }

    /** Metodo que cambia el balance
     */
    public int transferTo(Account another, int amount) {
        if (amount<= balance) {
            balance = balance - amount;
            another.balance = another.balance + amount;}
        else {
            System.out.println("Amount exceeded balance");}
        return balance;
    }

    /** Metodo que pasa a String la cuenta
     */
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}





