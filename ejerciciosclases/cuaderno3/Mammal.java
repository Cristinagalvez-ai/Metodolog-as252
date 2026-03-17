package matcomp.e1.ejerciciosclases.cuaderno3;

public class Mammal extends Animal {
    /** Constructor con nombre dado
     */
    public Mammal(String name) {
        super(name);
    }

    /** Metodo que pasa Mammal a texto
     */
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
