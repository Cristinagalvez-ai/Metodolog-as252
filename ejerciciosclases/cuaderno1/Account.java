package matcomp.e1.ejerciciosclases.cuaderno1;

public class Account {
    private String id;
    private String name;
    private int balance;

    /** Constructor que crea una cuenta con el id y el nombre dados
     */
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;
    }
    /** Constructor que crea una cuenta con el id, el nombre y el balance dados
     */
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    /** Metodo que devuelve el id de la cuenta
     */
    public String getId() {
        return id;
    }
    /** Metodo que devuelve el nombre de la cuenta
     */
    public String getName() {
        return name;
    }
    /** Metodo que devuelve el balance de la cuenta
     */
    public int getBalance() {
        return balance;
    }

    /** Metodo que calcula el nuevo balance de la cuenta con la cantidad dada
     */
    public int credit(int amount) {
        balance = balance + amount; //le sumamos al balance de la cuenta la cantidad dada
        return balance;
    }

    /** Metodo que calcula el débito de la cuenta
     */
    public int debit(int amount) {
        if (amount <= balance) {    // si la cantidad dada es menor que el balance
            balance = balance - amount;}    // el nuevo balance es el balance menos la cantidad
        else {
            System.out.println("Amount exceeded balance");}
        return balance;
    }

    /** Metodo que transfiere el balance de una cuenta a otra
     */
    public int transferTo(Account another, int amount) {
        if (amount<= balance) {
            balance = balance - amount; // le quitamos a una cuenta la cantidad amount
            another.balance = another.balance + amount;}    // y le añadimos esa cantidad a otra cuenta
        else {
            System.out.println("Amount exceeded balance");}
        return balance;
    }

    /** Metodo que pasa la cuenta a texto
     */
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
