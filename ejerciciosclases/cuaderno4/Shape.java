package matcomp.e1.ejerciciosclases.cuaderno4;

public abstract class Shape {
    //Atributos protected, las subclases pueden acceder a ellos directamente
    protected String color;
    protected Boolean filled;

    /** Constructor de la figura por defecto
     */
    public Shape() {
        color = "red";
        filled = true;
    }
    /** Constructor con parámetros dados
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /** Metodo que devuelve el color
     */
    public  String getColor() {
        return color;
    }
    /** Metodo que cambia el color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** Metodo que dice si esta rellena la figura o no
     */
    public boolean isFilled() {
        return filled;
    }
    /** Metodo que cambia filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Metodo abstracto que calcula el área
     */
    //todas las subclases tendrán que calcular su área
    public abstract double getArea();

    /** Metodo abstracto que calcula el perímetro
     */
    //todas las subclases tendrán que calcular su perímetro
    public abstract double getPerimeter();

    /** Metodo que pasa la figura a texto
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
