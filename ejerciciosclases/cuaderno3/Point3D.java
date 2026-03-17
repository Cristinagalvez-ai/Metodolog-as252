package matcomp.e1.ejerciciosclases.cuaderno3;

public class Point3D extends Point2D{
    private float z;

    /** Constructor del punto con x, y y z dados
     */
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    /** Constructor del punto3D por defecto
     */
    public Point3D() {
        super();
        z = 0.0f;
    }

    /** Metodo que devuelve la coordenada z
     */
    public float getZ() {
        return z;
    }
    /** Metodo que cambia la coordenada z
     */
    public void setZ(float z) {
        this.z = z;
    }

    /** Metodo que devuelve las 3 coordenadas
     */
    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = getX();
        result[1] = getY();
        result[2] = z;
        return result;
    }
    /** Metodo que cambia las 3 coordenadas
     */
    public void setXYZ(float x, float y, float z) {
        setX(x);    //utiliza los setters de la superclase Point2D
        setY(y);
        this.z = z;
    }

    /** Metodo que pasa el punto3D a texto
     */
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
