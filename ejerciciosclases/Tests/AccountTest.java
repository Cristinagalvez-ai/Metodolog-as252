package matcomp.e1.ejerciciosclases.cuaderno2.customer2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import matcomp.e1.ejerciciosclases.cuaderno2.customer2.*;

class AccountTest {
    Customer c = new Customer(10, "Elena", 'f');
    Account account = new Account(88, c, 500.0);

    @Test
    void getId() {
        assertEquals(88, account.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(c, account.getCustomer());
    }

    @Test
    void getBalance() {
        assertEquals(500.0, account.getBalance());
    }

    @Test
    void setBalance() {
        account.setBalance(1000.50);
        assertEquals(1000.50, account.getBalance());
    }

    @Test
    void getCustomerName() {
        assertEquals("Elena", account.getCustomerName());
    }

    @Test
    void deposit() {
        account.deposit(100.0);
        assertEquals(600.0, account.getBalance());
    }

    @Test
    void withdrawSuccess() {
        account.withdraw(200.0);
        assertEquals(300.0, account.getBalance());
    }

    @Test
    void withdrawFail() {
        // Intento de retirar más de lo que hay (500.0)
        account.withdraw(600.0);
        assertEquals(500.0, account.getBalance()); // El saldo no debe cambiar
    }

    @Test
    void testToString() {
        // Verifica el formato de dos decimales del balance
        assertEquals("Elena(10) balance=$500.00", account.toString());
    }

    @Test
    void testChaining() {
        // Verifica que los métodos devuelven el objeto account para encadenar
        account.deposit(50).withdraw(100);
        assertEquals(450.0, account.getBalance());
    }
}