package matcomp.e1.ejerciciosclases.cuaderno1;

public class Date {
    private int day;
    private int month;
    private int year;

    /** Constructor que crea una fecha con los parámetros dados
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /** Metodo que devuelve el día
     */
    public int getDay() {
        return day;
    }
    /** Metodo que devuelve el mes
     */
    public int getMonth() {
        return month;
    }
    /** Metodo que devuelve el año
     */
    public int getYear() {
        return year;
    }

    /** Metodo que cambia el dia
     */
    public void setDay(int day) {
        this.day = day;
    }
    /** Metodo que cambia el mes
     */
    public void setMonth(int month) {
        this.month = month;
    }
    /** Metodo que cambia el año
     */
    public void setYear(int year) {
        this.year = year;
    }
    /** Metodo que cambia la fecha
     */
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /** Metodo que pasa la fecha a texto
     * */
    public String toString() {  // "dd/mm/yyyy" with leading zero
        return String.format("%02d/%02d/%04d", day, month, year);
    }   // usamos 02 para que añada como máximo 2 cifras, rellenando con 0, y 04 para lo mismo pero con 4 cifras
}       //y usamos %d para que añada un número entero
