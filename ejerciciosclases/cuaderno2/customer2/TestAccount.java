package matcomp.e1.ejerciciosclases.cuaderno2.customer2;

public class TestAccount {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(1, "Cris", 'f');
        System.out.println(c1); // Customer´s toString()
        // Test Customer´s setters and getters
        System.out.println("customer id: " + c1.getId());
        System.out.println("customer name: " + c1.getName());
        System.out.println("customer gender: " + c1.getGender());

        // Test Account class
        Account a1 = new Account(101, c1, 50.00);
        System.out.println(a1);     // Account´s toString()
        a1.setBalance(88.88);
        System.out.println(a1);     // Account´s toString()
        // Test Account´s setters and getters
        System.out.println("id: " + a1.getId());
        System.out.println("customer: " + a1.getCustomer());
        System.out.println("customer name: " + a1.getCustomerName());
        System.out.println("balance: " + a1.getBalance());
        // Test deposit and withdraw
        a1.deposit(10.00);
        System.out.println(a1);     // balance sube

        a1.withdraw(5.50);
        System.out.println(a1);     // balance baja
        a1.withdraw(1000);
        System.out.println(a1);     // mensaje de error, el balance no cambia
    }
}
