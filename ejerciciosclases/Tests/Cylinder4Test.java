package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Cylinder4Test {

    @Test
    void getHeight() {
        Cylinder4 c = new Cylinder4(5.0,"red",10.0 );

        assertEquals(10.0, c.getHeight(), 0.0001);
    }

    @Test
    void setHeight() {
        Cylinder4 c = new Cylinder4(5.0, "red", 10.0);

        c.setHeight(20.0);

        assertEquals(20.0, c.getHeight(), 0.0001);
    }

    @Test
    void getRadius() {
        Cylinder4 c = new Cylinder4(5.0, "red", 10.0);

        assertEquals(5.0, c.getRadius(), 0.0001);
    }

    @Test
    void setRadius() {
        Cylinder4 c = new Cylinder4(5.0, "red", 10.0);

        c.setRadius(8.0);

        assertEquals(8.0, c.getRadius(), 0.0001);
    }

    @Test
    void getColor() {
        Cylinder4 c = new Cylinder4(5.0, "red", 10.0);

        assertEquals("red", c.getColor());
    }

    @Test
    void setColor() {
        Cylinder4 c = new Cylinder4(5.0, "red", 10.0);

        c.setColor("blue");

        assertEquals("blue", c.getColor());
    }

    @Test
    void getAreaBase() {
        Cylinder4 c = new Cylinder4(5.0, "red", 10.0);

        // π * r^2 = π * 4
        assertEquals(Math.PI * 4, c.getAreaBase(), 0.0001);
    }

    @Test
    void getVolume() {
        Cylinder4 c = new Cylinder4(5.0, "red", 10.0);

        // volumen = área base * altura = (π * 4) * 5
        assertEquals(Math.PI * 4 * 5, c.getVolume(), 0.0001);
    }

    @Test
    void testToString() {
        Cylinder4 c = new Cylinder4(5.0, "red", 10.0);

        String expected = "Cylinder[Circle[radius=5.0,color=red],height=10.0]";

        assertEquals(expected, c.toString());
    }
}