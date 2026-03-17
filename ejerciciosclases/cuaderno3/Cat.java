package matcomp.e1.ejerciciosclases.cuaderno3;

public class Cat extends Mammal{
    /** Constructor de Cat con nombre dado
     */
    public Cat(String name) {
        super(name);
    }

    /** Metodo que imprime "Meow"
     */
    public void greets() {
        System.out.println("Meow");
    }

    /** Metodo que pasa Cat a texto
     */
    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
