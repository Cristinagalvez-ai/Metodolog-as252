package matcomp.e1.ejerciciosclases.cuaderno2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import matcomp.e1.ejerciciosclases.cuaderno2.*;

class InvoiceTest {
    Customer customer = new Customer(1, "Alice", 10);
    Invoice invoice = new Invoice(101, customer, 200.0);

    @Test
    void getId() {
        assertEquals(101, invoice.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    void setCustomer() {
        Customer c2 = new Customer(2, "Bob", 5);
        invoice.setCustomer(c2);
        assertEquals(c2, invoice.getCustomer());
    }

    @Test
    void getAmount() {
        assertEquals(200.0, invoice.getAmount());
    }

    @Test
    void setAmount() {
        invoice.setAmount(150.0);
        assertEquals(150.0, invoice.getAmount());
    }

    @Test
    void getCustomerId() {
        assertEquals(1, invoice.getCustomerId());
    }

    @Test
    void getCustomerName() {
        assertEquals("Alice", invoice.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        assertEquals(10, invoice.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        // 200 - (200 * 10 / 100) = 180
        assertEquals(180.0, invoice.getAmountAfterDiscount());
    }
}