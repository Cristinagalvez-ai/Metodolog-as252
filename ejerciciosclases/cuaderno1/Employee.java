package matcomp.e1.ejerciciosclases.cuaderno1;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    /** Constructor que crea un empleado con los parámetros dados
     */
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    /** Metodo que devuelve el id del empleado
     */
    public int getId() {
        return id;
    }

    /** Metodo que devuelve el primer nombre del empleado
     */
    public String getFirstName() {
        return firstName;
    }

    /** Metodo que devuelve el último nombre del empleado
     */
    public String getLastName() {
        return lastName;
    }

    /** Metodo que devuelve el nombre completo del empleado
     */
    public String getName() {
        return firstName + " " + lastName;
    }

    /** Metodo que devuelve el salario del empleado
     */
    public int getSalary() {
        return salary;
    }

    /** Metodo que cambia el salario del empleado
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /** Metodo que calcula el salario anual del empleado
     */
    public int getAnnualSalary() {
        return salary*12;
    }

    /** Metodo que aumenta el salario un tanto por ciento
     */
    public int raiseSalary(int percent) {
        salary = salary + salary*percent/100;
        return salary;
    }

    /** Metodo que pasa a texto el empleado
     */
    public String toString() {
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }
}
