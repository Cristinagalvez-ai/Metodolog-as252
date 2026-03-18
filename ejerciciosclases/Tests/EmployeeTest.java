package matcomp.e1.ejerciciosclases.cuaderno1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee e = new Employee(1, "Cris", "Lopez", 1000);

        assertEquals(1, e.getId());
    }

    @Test
    void getFirstName() {
        Employee e = new Employee(1, "Cris", "Lopez", 1000);

        assertEquals("Cris", e.getFirstName());
    }

    @Test
    void getLastName() {
        Employee e = new Employee(1, "Cris", "Lopez", 1000);

        assertEquals("Lopez", e.getLastName());
    }

    @Test
    void getName() {
        Employee e = new Employee(1, "Cris", "Lopez", 1000);

        assertEquals("Cris Lopez", e.getName());
    }

    @Test
    void getSalary() {
        Employee e = new Employee(1, "Cris", "Lopez", 1000);

        assertEquals(1000, e.getSalary());
    }

    @Test
    void setSalary() {
        Employee e = new Employee(1, "Cris", "Lopez", 1000);

        e.setSalary(2000);

        assertEquals(2000, e.getSalary());
    }

    @Test
    void getAnnualSalary() {
        Employee e = new Employee(1, "Cris", "Lopez", 1000);

        // 1000 * 12
        assertEquals(12000, e.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        Employee e = new Employee(1, "Cris", "Lopez", 1000);

        e.raiseSalary(10); // 10% de subida → 1100

        assertEquals(1100, e.getSalary());
    }

    @Test
    void testToString() {
        Employee e = new Employee(1, "Cris", "Lopez", 1000);

        String expected = "Employee[id=1,name=Cris Lopez,salary=1000]";

        assertEquals(expected, e.toString());
    }
}