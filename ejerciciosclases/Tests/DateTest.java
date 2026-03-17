package matcomp.e1.ejerciciosclases.cuaderno1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date d = new Date(10, 5, 2024);

        assertEquals(10, d.getDay());
    }

    @Test
    void getMonth() {
        Date d = new Date(10, 5, 2024);

        assertEquals(5, d.getMonth());
    }

    @Test
    void getYear() {
        Date d = new Date(10, 5, 2024);

        assertEquals(2024, d.getYear());
    }

    @Test
    void setDay() {
        Date d = new Date(10, 5, 2024);

        d.setDay(20);

        assertEquals(20, d.getDay());
    }

    @Test
    void setMonth() {
        Date d = new Date(10, 5, 2024);

        d.setMonth(8);

        assertEquals(8, d.getMonth());
    }

    @Test
    void setYear() {
        Date d = new Date(10, 5, 2024);

        d.setYear(2030);

        assertEquals(2030, d.getYear());
    }

    @Test
    void setDate() {
        Date d = new Date(10, 5, 2024);

        d.setDate(1, 1, 2000);

        assertEquals(1, d.getDay());
        assertEquals(1, d.getMonth());
        assertEquals(2000, d.getYear());
    }

    @Test
    void testToString() {
        Date d = new Date(10, 5, 2024);

        String expected = "10/5/2024";

        assertEquals(expected, d.toString());
    }
}