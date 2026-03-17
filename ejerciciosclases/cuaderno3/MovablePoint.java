package matcomp.e1.ejerciciosclases.cuaderno3;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    /** Constructor del punto con velocidades y coordenadas dadas
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    /** Constructor del punto con velocidades dadas y coordenadas por defecto
     */
    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    /** Constructor del punto con velocidades y coordenadas por defecto
     */
    public MovablePoint() {
        super();
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    /** Metodo que devuelve la velocidad de x
     */
    public float getXSpeed() {
        return xSpeed;
    }
    /** Metodo que cambia la velocidad de x
     */
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    /** Metodo que devuelve la velocidad de y
     */
    public float getYSpeed() {
        return ySpeed;
    }
    /** Metodo que cambia la velocidad de y
     */
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    /** Metodo que cambia ambas velocidades
     */
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    /** Metodo que devuelve ambas velocidades
     */
    public float[] getSpeed() {
        float[] result = new float[2];
        result[0] = xSpeed;
        result[1] = ySpeed;
        return result;
    }

    /** Metodo que pasa la velocidad a texto
     */
    @Override
    public String toString() {
        return super.toString() + ",speed=(" + xSpeed + "," + ySpeed + ")";
    }

    /** Metodo que mueve el punto según su velocidad
     */
    public MovablePoint move() {
        setX(getX() + xSpeed);  //utiliza los setters y getters de la superclase Point
        setY(getY() + ySpeed);  //actualizamos las coordenadas con los setters sumándoles la velocidad de cada una
        return this;
    }
}
