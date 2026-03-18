package matcomp.e1.ejerciciosclases.cuaderno1;

public class Circle {
    private double radius;

    /** Constructor que crea un círculo por defecto
     */
    public Circle() {
        radius = 1.0;
    }
    /** Constructor que crea un círculo con el radio dado
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Metodo que devuelve el radio
     * */
    public double getRadius() {
        return radius;
    }

    /** Metodo que cambia el radio
     * */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Metodo que calcula el area
     * */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    /** Metodo que calcula el perímetro
     * */
    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    /** Metodo que pasa el círculo a texto
     * */
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
