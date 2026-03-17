package matcomp.e1.ejerciciosclases.cuaderno4;

public class Circlee implements GeometricObject {
    private double radius;

    /** Constructor del círculo con el radio dado
     */
    public Circlee(double radius) {
        this.radius = radius;
    }

    /** Metodo que calcula el área del círculo
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /** Metodo que calcula el perímetro del círculo
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /** Devuelve el círculo en formato texto
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
