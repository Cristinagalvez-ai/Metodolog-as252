package matcomp.e1.ejerciciosclases.cuaderno3;

public class Animal {
    private String name;

    /** Constructor de un animal con el nombre dado
     */
    public Animal(String name) {
        this.name = name;
    }

    /** Metodo que pasa Animal a texto
     */
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
