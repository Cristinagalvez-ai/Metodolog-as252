package matcomp.e1.ejerciciosclases.cuaderno2;

public class  Invoice {
    // Atributos de la factura, asociada a un objeto Customer
    private int id;
    private Customer customer;
    private double amount;

    /** Constructor de la factura */
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    /** Getters y Setters básicos */
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /** Metodos que delegan en el objeto customer para obtener sus datos */
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    /** Metodo que calcula el final aplicando el descuento del cliente */
    public double getAmountAfterDiscount() {
        return amount - (amount*getCustomerDiscount()/100.0); // 100.0 because discount is a double
    }

    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer.toString() + ",amount=" + amount + "]";
    }
}
