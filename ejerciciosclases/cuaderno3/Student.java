package matcomp.e1.ejerciciosclases.cuaderno3;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor de Student con name, address, program, year and fee dados
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Metodo que devuelve el programa
     */
    public String getProgram() {
        return program;
    }

    /**
     * Metodo que cambia el programa
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Metodo que devuelve el año
     */
    public int getYear() {
        return year;
    }

    /**
     * Metodo que cambia el año
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Metodo que devuelve la matrícula
     */
    public double getFee() {
        return fee;
    }
    /** Metodo que cambia la matrícula
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /** Metodo que pasa Student a texto
     */
    @Override
    public String toString() {
        return "Student[" + super.toString()    //usa el toString() de Person
                + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}
