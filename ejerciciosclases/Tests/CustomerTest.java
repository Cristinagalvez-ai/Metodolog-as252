package matcomp.e1.ejerciciosclases.cuaderno2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import matcomp.e1.ejerciciosclases.cuaderno2.Customer;

class CustomerTest {
    Customer customer = new Customer(1, "Alice", 15);

    @Test
    void getId() {
        assertEquals(1, customer.getId());
    }

    @Test
    void getName() {
        assertEquals("Alice", customer.getName());
    }

    @Test
    void getDiscount() {
        assertEquals(15, customer.getDiscount());
    }

    @Test
    void setDiscount() {
        customer.setDiscount(20);
        assertEquals(20, customer.getDiscount());
    }

    @Test
    void testToString() {
        assertEquals("Alice(1)(15%)", customer.toString());
    }
}