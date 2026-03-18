package matcomp.e1.ejerciciosclases.cuaderno4;

public class ResizableCircle extends Circle implements Resizable{

    /** Constructor que crea un círculo para cambiarle el tamaño con el radio dado
     */
    public ResizableCircle(double radius){
        super(radius);
    }

    /** Metodo que le cambia el tamaño al círculo
     */
    @Override
    public void resize(int percent){
        this.radius *= (percent / 100.0);
    }

    /** Metodo que pasa el círculo con el tamaño cambiado a texto
     */
    public String toString(){
        return "ResizableCircle["+super.toString()+"]";
    }
}
