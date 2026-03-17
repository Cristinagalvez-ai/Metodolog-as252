package matcomp.e1.ejerciciosclases.cuaderno3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student s = new Student("Cris", "Madrid", "MatComp", 2024, 1500.0);

        assertEquals("MatComp", s.getProgram());
    }

    @Test
    void setProgram() {
        Student s = new Student("Cris", "Madrid", "MatComp", 2024, 1500.0);

        s.setProgram("Fisica");

        assertEquals("Fisica", s.getProgram());
    }

    @Test
    void getYear() {
        Student s = new Student("Cris", "Madrid", "MatComp", 2024, 1500.0);

        assertEquals(2024, s.getYear());
    }

    @Test
    void setYear() {
        Student s = new Student("Cris", "Madrid", "MatComp", 2024, 1500.0);

        s.setYear(2025);

        assertEquals(2025, s.getYear());
    }

    @Test
    void getFee() {
        Student s = new Student("Cris", "Madrid", "MatComp", 2024, 1500.0);

        assertEquals(1500.0, s.getFee(), 0.0001);
    }

    @Test
    void setFee() {
        Student s = new Student("Cris", "Madrid", "MatComp", 2024, 1500.0);

        s.setFee(2000.0);

        assertEquals(2000.0, s.getFee(), 0.0001);
    }

    @Test
    void testToString() {
        Student s = new Student("Cris", "Madrid", "MatComp", 2024, 1500.0);

        String expected = "Student[Person[name=Cris,address=Madrid],program=MatComp,year=2024,fee=1500.0]";

        assertEquals(expected, s.toString());
    }
}