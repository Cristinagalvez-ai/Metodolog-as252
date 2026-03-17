package matcomp.e1.ejerciciosclases.cuaderno3;

public class Shape {
    private String color;
    private boolean filled;

    /** Constructor de la figura por defecto
     */
    public Shape() {
        color = "red";
        filled = true;
    }
    /** Constructor de la figura con parámetros dados
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /** Metodo que devuelve el color
     */
    public String getColor() {
        return color;
    }
    /** Metodo que cambia el color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** Metodo que devuelve True or False
     */
    public boolean isFilled() {
        return filled;
    }
    /** Metodo que cambia el parámetro filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Metodo que pasa la figura a texto
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
