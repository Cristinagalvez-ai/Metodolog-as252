
package matcomp.e1.ejerciciosclases.cuaderno2;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    /** Constructor que crea una línea con 4 coordenadas
     */
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    /** Constructor que crea una línea con 2 puntos
     */
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    /** Metodo que devuelve el punto inicial
     */
    public MyPoint getBegin() {
        return begin;
    }

    /** Metodo que cambia el punto inicial
     */
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    /** Metodo que devuelve el punto final
     */
    public MyPoint getEnd() {
        return end;
    }

    /** Metodo que cambia el punto final
     */
    public void  setEnd(MyPoint end) {
        this.end = end;
    }

    /** Metodo que devuelve la x del punto inicial
     */
    public int getBeginX() {
        return begin.getX();
    }

    /** Metodo que cambia la x del punto inicial
     */
    public void setBeginX(int x) {
        begin.setX(x);
    }

    /** Metodo que devuelve la y del punto inicial
     */
    public int getBeginY() {
        return begin.getY();
    }
    /** Metodo que cambia la y del punto inicial
     */
    public void setBeginY(int y) {
        begin.setY(y);
    }

    /** Metodo que devuelve la x del punto final
     */
    public int getEndX() {
        return end.getX();
    }
    /** Metodo que cambia la x del punto final
     */
    public void setEndX(int x) {
        end.setX(x);
    }
    /** Metodo que devuelve la y del punto final
     */
    public int getEndY() {
        return end.getY();
    }
    /** Metodo que cambia la y del punto final
     */
    public void setEndY(int y) {
        end.setY(y);
    }

    /** Metodo que devuelve las coordenadas del punto inicial
     */
    public int[] getBeginXY() {
        return begin.getXY();
    }
    /** Metodo que cambia las coordenadas del punto inicial
     */
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }
    /** Metodo que devuelve las coordenadas del punto final
     */
    public int[] getEndXY() {
        return end.getXY();
    }
    /** Metodo que cambia las coordenadas del punto final
     */
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    /** Metodo que calcula la longitud desde el punto inicial hasta el final
     */
    public double getLength() {
            return begin.distance(end);
    }

    /** Metodo que devuelve el ángulo de la recta en radianes
     */
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    /** Metodo que devuelve la línea en forma de texto
     */
    public String toString() {
        return "MyLine[begin=" + begin + ",end=" + end + "]";   //el begin y el end llaman automáticamente al toString de la clase MyPoint
    }
}
