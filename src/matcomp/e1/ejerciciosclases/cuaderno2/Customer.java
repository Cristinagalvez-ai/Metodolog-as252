package matcomp.e1.ejerciciosclases.cuaderno2;

public class Customer {
    // Atributos privados del cliente incluyendo el descuento
    private int id;
    private String name;
    private int discount;

    /** Constructor para inicializar el cliente */
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    /** Metodos Getter */
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    /** Metodo para actualizar el descuento */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /** Metodo que pasa el cliente a texto con su % de descuento */
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}
