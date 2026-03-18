package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D p = new Point3D(1.0f, 2.0f, 3.0f);

        assertEquals(3.0f, p.getZ(), 0.0001);
    }

    @Test
    void setZ() {
        Point3D p = new Point3D(1.0f, 2.0f, 3.0f);

        p.setZ(5.0f);

        assertEquals(5.0f, p.getZ(), 0.0001);
    }

    @Test
    void getXYZ() {
        Point3D p = new Point3D(1.0f, 2.0f, 3.0f);

        float[] coords = p.getXYZ();

        assertEquals(1.0f, coords[0], 0.0001);
        assertEquals(2.0f, coords[1], 0.0001);
        assertEquals(3.0f, coords[2], 0.0001);
    }

    @Test
    void setXYZ() {
        Point3D p = new Point3D(1.0f, 2.0f, 3.0f);

        p.setXYZ(4.0f, 5.0f, 6.0f);

        assertEquals(4.0f, p.getX(), 0.0001);
        assertEquals(5.0f, p.getY(), 0.0001);
        assertEquals(6.0f, p.getZ(), 0.0001);
    }

    @Test
    void testToString() {
        Point3D p = new Point3D(1.0f, 2.0f, 3.0f);

        String expected = "(1.0,2.0,3.0)";

        assertEquals(expected, p.toString());
    }
}