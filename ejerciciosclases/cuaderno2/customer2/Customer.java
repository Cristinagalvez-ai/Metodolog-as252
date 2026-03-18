package matcomp.e1.ejerciciosclases.cuaderno2.customer2;

public class Customer {
    //atributos privados del cliente
    private int id;
    private String name;
    private char gender;

    /** Constructor para crear un cliente con, id, nombre y género
     */

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    /** Metodo que devuelve el ID del cliente */
    public int getId() {
        return id;
    }
    /** Metodo que devuelve el nombre del cliente */
    public String getName() {
        return name;
    }
    /** Metodo que devuelve el genero del cliente */
    public char getGender() {
        return gender;
    }

    /** Pasa el cliente a texto */

    public String toString() {
        return name + "(" + id + ")";
    }
}
