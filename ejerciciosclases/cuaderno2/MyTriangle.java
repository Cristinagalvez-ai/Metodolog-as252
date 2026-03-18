package matcomp.e1.ejerciciosclases.cuaderno2;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    /** Constructor que crea un triángulo con todas las coordenadas dadas
     */
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    /** Constructor que crea un triángulo con los vértices dados
     */
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    /** Metodo que devuelve el triángulo en forma de texto
     */
    public String toString() {
        return "MyTriangle[v1=" + v1.toString() + ",v2=" + v2.toString() + ",v3=" + v3.toString() + "]";
    }

    /** Metodo que calcula el perímetro del triángulo
     */
    public double getPerimeter() {
        double lado1 = v1.distance(v2);
        double lado2 = v2.distance(v3);
        double lado3 = v3.distance(v1);
        return lado1 + lado2 + lado3;
    }

    /** Metodo que devuelve el tipo de triángulo
     */
    public String getType() {
        double lado1 = v1.distance(v2);
        double lado2 = v2.distance(v3);
        double lado3 = v3.distance(v1);
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilateral";
        }
        if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            return "Isosceles";
        }
        return "Scalene";
    }




}
