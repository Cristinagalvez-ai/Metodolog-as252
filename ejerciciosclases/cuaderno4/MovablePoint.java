package matcomp.e1.ejerciciosclases.cuaderno4;

public class MovablePoint implements Movable {
    //atributos con package access
    // coordenadas del punto
    int x;
    int y;
    // velocidad en cada eje
    int xSpeed;
    int ySpeed;

    /** Constructor del punto movido
     * */
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /** Metodo que pasa a texto el punto y su velocidad
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    /** Metodo que mueve hacia arriba el punto
     */
    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    /** Metodo que mueve hacia abajo el punto
    */
    @Override
    public void moveDown() {
        y += ySpeed;
    }

    /** Metodo que mueve hacia la izquierda el punto
     */
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    /** Metodo que mueve hacia la derecha el punto
     */
    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
