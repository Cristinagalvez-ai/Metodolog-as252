package matcomp.e1.ejerciciosclases.cuaderno1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest1 {

    @Test
    void getId() {
        Account acc = new Account("A1", "Cris", 100);

        assertEquals("A1", acc.getId());
    }

    @Test
    void getName() {
        Account acc = new Account("A1", "Cris", 100);

        assertEquals("Cris", acc.getName());
    }

    @Test
    void getBalance() {
        Account acc = new Account("A1", "Cris", 100);

        assertEquals(100, acc.getBalance());
    }

    @Test
    void credit() {
        Account acc = new Account("A1", "Cris", 100);

        acc.credit(50);

        assertEquals(150, acc.getBalance());
    }

    @Test
    void debit() {
        Account acc = new Account("A1", "Cris", 100);

        acc.debit(30);

        assertEquals(70, acc.getBalance());
    }

    @Test
    void transferTo() {
        Account acc1 = new Account("A1", "Cris", 100);
        Account acc2 = new Account("A2", "Ana", 50);

        acc1.transferTo(acc2, 40);

        assertEquals(60, acc1.getBalance());
        assertEquals(90, acc2.getBalance());
    }

    @Test
    void testToString() {
        Account acc = new Account("A1", "Cris", 100);

        String expected = "Account[id=A1,name=Cris,balance=100]";

        assertEquals(expected, acc.toString());
    }
}