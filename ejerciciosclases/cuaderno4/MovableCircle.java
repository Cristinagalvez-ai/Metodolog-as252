package matcomp.e1.ejerciciosclases.cuaderno4;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    /** Constructor que crea un círculo y su velocidad con los parámetros dados
     */
     public  MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
         this.center = new MovablePoint(1,1,2,2);
         this. radius =radius;
     }

    /** Metodo que mueve hacia arriba el círculo
     */
    @Override
    public void moveUp(){
        center.y += center.ySpeed;  //solo movemos el punto del centro
    }
    /** Metodo que mueve hacia abajo el círculo
     */
    @Override
    public void moveDown(){
        center.y -= center.ySpeed;
    }

    /** Metodo que mueve hacia la izquierda el círculo
     */
    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }
    /** Metodo que mueve hacia la derecha el círculo
     */
    @Override
    public void moveRight(){
        center.x += center.xSpeed;
    }

    /** Metodo que pasa a texto el círculo y su velocidad
     */
    public String toString(){
        return "("+center.x+","+center.y+"), speed=("+center.x+","+center.y+"), radius="+radius;
    }
}
