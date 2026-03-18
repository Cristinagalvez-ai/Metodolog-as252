package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person p = new Person("Cris", "Madrid");

        assertEquals("Cris", p.getName());
    }

    @Test
    void getAddress() {
        Person p = new Person("Cris", "Madrid");

        assertEquals("Madrid", p.getAddress());
    }

    @Test
    void setAddress() {
        Person p = new Person("Cris", "Madrid");

        p.setAddress("Barcelona");

        assertEquals("Barcelona", p.getAddress());
    }

    @Test
    void testToString() {
        Person p = new Person("Cris", "Madrid");

        String expected = "Person[name=Cris,address=Madrid]";

        assertEquals(expected, p.toString());
    }
}