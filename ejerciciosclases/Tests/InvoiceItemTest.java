package matcomp.e1.ejerciciosclases.cuaderno1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem item = new InvoiceItem("A1", "Teclado", 2, 50.0);

        assertEquals("A1", item.getId());
    }

    @Test
    void getDesc() {
        InvoiceItem item = new InvoiceItem("A1", "Teclado", 2, 50.0);

        assertEquals("Teclado", item.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem item = new InvoiceItem("A1", "Teclado", 2, 50.0);

        assertEquals(2, item.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem item = new InvoiceItem("A1", "Teclado", 2, 50.0);

        item.setQty(5);

        assertEquals(5, item.getQty());
    }

    @Test
    void getUnitPrice() {
        InvoiceItem item = new InvoiceItem("A1", "Teclado", 2, 50.0);

        assertEquals(50.0, item.getUnitPrice(), 0.0001);
    }

    @Test
    void setUnitPrice() {
        InvoiceItem item = new InvoiceItem("A1", "Teclado", 2, 50.0);

        item.setUnitPrice(75.0);

        assertEquals(75.0, item.getUnitPrice(), 0.0001);
    }

    @Test
    void getTotal() {
        InvoiceItem item = new InvoiceItem("A1", "Teclado", 2, 50.0);

        // 2 * 50 = 100
        assertEquals(100.0, item.getTotal(), 0.0001);
    }

    @Test
    void testToString() {
        InvoiceItem item = new InvoiceItem("A1", "Teclado", 2, 50.0);

        String expected = "InvoiceItem[id=A1,desc=Teclado,qty=2,unitPrice=50.0]";

        assertEquals(expected, item.toString());
    }
}