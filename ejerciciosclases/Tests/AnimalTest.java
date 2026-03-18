package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal a = new Animal("Bicho");

        String expected = "Animal[name=\"Bicho\"]";

        assertEquals(expected, a.toString());
    }
}