package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Mammal m = new Mammal("León");

        String expected = "Mammal[Animal[name=\"León\"]]";

        assertEquals(expected, m.toString());
    }
}