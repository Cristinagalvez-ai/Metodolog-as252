package matcomp.e1.ejerciciosclases.cuaderno3;

public class Staff extends Person {
    private String school;
    private double pay;

    /** Constructor con parámetros dados
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /** Metodo que devuelve el colegio
     */
    public String getSchool() {
        return school;
    }
    /** Metodo que cambia el colegio
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /** Metodo que devuelve el salario
     */
    public double getPay() {
        return pay;
    }
    /** Metodo que cambia el salario
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /** Metodo que pasa Staff a texto
     */
    @Override
    public String toString() {
        return "Staff[" + super.toString()  //usa el toString() de Person
        + ",school=" + school + ",pay=" + pay + "]";
    }
}
