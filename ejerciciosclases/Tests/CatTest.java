package matcomp.e1.ejerciciosclases.cuaderno3;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat c = new Cat("Misu");

        // Capturar lo que se imprime por pantalla
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        c.greets();

        assertEquals("Meow\n", output.toString());
    }

    @Test
    void testToString() {
        Cat c = new Cat("Misu");

        String expected = "Cat[Mammal[Animal[name=\"Misu\"]]]";

        assertEquals(expected, c.toString());
    }
}