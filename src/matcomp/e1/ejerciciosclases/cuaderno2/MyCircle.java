package matcomp.e1.ejerciciosclases.cuaderno2;

public class MyCircle {
    private MyPoint center;
    private int radius;

    /** Constructor que crea un círculo con centro y radio por defecto
     */
    public MyCircle() {
        center = new MyPoint(0,0);
        radius = 1;
    }
    /** Constructor que crea un círculo con coordenadas del centro y radio
     */
    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }
    /** Constructor que crea un círculo con un centro y radio dados
     */
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    /** Metodo que devuelve el radio
     */
    public int getRadius() {
        return radius;
    }
    /** Metodo que cambia el radio
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /** Metodo que devuelve el centro
     */
    public MyPoint getCenter() {
        return center;
    }
    /** Metodo que cambia el centro
     */
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    /** Metodo que devuelve la coordenada x del centro
     */
    public int getCenterX() {
        return center.getX();
    }
    /** Metodo que cambia la coordenada x del centro
     */
    public void setCenterX(int x) {
        center.setX(x);
    }

    /** Metodo que devuelve la coordenada y del centro
     */
    public int getCenterY() {
        return center.getY();
    }
    /** Metodo que cambia la coordenada y del centro
     */
    public void setCenterY(int y) {
        center.setY(y);
    }

    /** Metodo que devuelve las coordenadas x e y del centro
     */
    public int[] getCenterXY() {
        return center.getXY();
    }
    /** Metodo que cambia las coordenadas x e y del centro
     */
    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    /** Metodo que devuelve el círculo en forma de texto
     */
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]";
    }

    /** Metodo que calcula el área del circulo
     */
    public double getArea() {
        return Math.PI*radius*radius;
    }

    /** Metodo que calcula la circunferencia (el perímetro) del círculo
     */
    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    /** Metodo que calcula la distancia entre el centro de este círculo y el círculo dado
     */
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
}
