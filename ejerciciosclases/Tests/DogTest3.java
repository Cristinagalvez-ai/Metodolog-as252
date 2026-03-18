package matcomp.e1.ejerciciosclases.cuaderno3;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest3 {

    @Test
    void greets() {
        Dog d = new Dog("Rex");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        d.greets();

        assertEquals("Woof\n", output.toString());
    }

    @Test
    void testGreets() {
        Dog d1 = new Dog("Rex");
        Dog d2 = new Dog("Max");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        d1.greets(d2);

        assertEquals("Woooof\n", output.toString());
    }

    @Test
    void testToString() {
        Dog d = new Dog("Rex");

        String expected = "Dog[Mammal[Animal[name=\"Rex\"]]]";

        assertEquals(expected, d.toString());
    }
}