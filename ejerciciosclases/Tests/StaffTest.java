package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff s = new Staff("Cris", "Madrid", "IES", 1000.0);

        assertEquals("IES", s.getSchool());
    }

    @Test
    void setSchool() {
        Staff s = new Staff("Cris", "Madrid", "IES", 1000.0);

        s.setSchool("Universidad");

        assertEquals("Universidad", s.getSchool());
    }

    @Test
    void getPay() {
        Staff s = new Staff("Cris", "Madrid", "IES", 1000.0);

        assertEquals(1000.0, s.getPay(), 0.0001);
    }

    @Test
    void setPay() {
        Staff s = new Staff("Cris", "Madrid", "IES", 1000.0);

        s.setPay(2000.0);

        assertEquals(2000.0, s.getPay(), 0.0001);
    }

    @Test
    void testToString() {
        Staff s = new Staff("Cris", "Madrid", "IES", 1000.0);

        String expected = "Staff[Person[name=Cris,address=Madrid],school=IES,pay=1000.0]";

        assertEquals(expected, s.toString());
    }
}