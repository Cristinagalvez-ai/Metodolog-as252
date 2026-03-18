package matcomp.e1.ejerciciosclases.cuaderno2.customer2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import matcomp.e1.ejerciciosclases.cuaderno2.customer2.Customer;

class CustomerTest {
    Customer customer = new Customer(555, "Mateo", 'm');

    @Test
    void getId() {
        assertEquals(555, customer.getId());
    }

    @Test
    void getName() {
        assertEquals("Mateo", customer.getName());
    }

    @Test
    void getGender() {
        assertEquals('m', customer.getGender());
    }

    @Test
    void testToString() {
        assertEquals("Mateo(555)", customer.toString());
    }
}
