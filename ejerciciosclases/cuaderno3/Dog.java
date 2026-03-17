package matcomp.e1.ejerciciosclases.cuaderno3;

public class Dog extends Mammal {
    /** Constructor de Dog con nombre dado
     */
    public Dog(String name) {
        super(name);
    }

    /** Metodo que imprime "Woof"
     */
    public void greets() {
        System.out.println("Woof");
    }
    /** Metodo que imprime "Woooof"
     */
    public void greets(Dog another) {
        System.out.println("Woooof");
    }
    //No se puede hacer una llamada a greets de un animal, porque en  la superclase Animal no está definido el metodo greets() sino en sus subclases Cat y Dog
    //Es decir, desde una subclase se puede acceder a una super clase, pero no al revés
    /** Metodo que pasa Dog a texto
     */
    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
