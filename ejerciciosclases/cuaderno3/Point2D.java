package matcomp.e1.ejerciciosclases.cuaderno3;

public class Point2D {
    private float x;
    private float y;

    /** Constructor del punto con x e y dados
     */
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    /** Constructor del punto por defecto
     */
    public Point2D() {
        x = 0.0f;
        y = 0.0f;
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

    /** Metodo que devuelve ambas coordenadas
     */
    public float[] getXY() {
        float[] result = new float[2]; //construye un array de 2 elementos
        result[0] = x;
        result[1] = y;
        return result;  //devuelve el array
    }
    /** Metodo que cambia ambas coordenadas
     */
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /** Metodo que pasa el punto2D a texto
     */
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
