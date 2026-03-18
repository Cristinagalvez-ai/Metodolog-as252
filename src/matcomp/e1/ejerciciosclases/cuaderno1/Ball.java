package matcomp.e1.ejerciciosclases.cuaderno1;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    /** Constructor que crea una pelota con los parámetros dados
     */
    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    /** Metodo que devuelve la coordenada x
     */
    public float getX() {
        return x;
    }

    /** Metodo que cambia la coordenada x
     */
    public void setX(float x) {
        this.x = x;
    }

    /** Metodo que devuelve la coordenada y
     */
    public float getY() {
        return y;
    }
    /** Metodo que cambia la coordenada y
     */
    public void setY(float y) {
        this.y = y;
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
    /** Metodo que devuelve la velocidad xDelta
     */
    public float getXDelta() {
        return xDelta;
    }
    /** Metodo que cambia la velocidad xDelta
     */
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    /** Metodo que devuelve la velocidad yDelta
     */
    public float getYDelta() {
        return yDelta;
    }
    /** Metodo que cambia la velocidad yDelta
     */
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    /** Metodo que mueve las coordenadas x e y
     */
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    /** Metodo que cambia el signo de la velocidad de la pelota en horizontal
     */
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    /** Metodo que cambia el signo de la velocidad de la pelota en vertical
     */
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    /** Metodo que pasa a texto la pelota y su velocidad
     */
    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }






}
