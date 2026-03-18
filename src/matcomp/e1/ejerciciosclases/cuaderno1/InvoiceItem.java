package matcomp.e1.ejerciciosclases.cuaderno1;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    /** Constructor que crea el artículo de la factura con los parámetros dados
     */
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    /** Metodo que devuelve el id de la factura
     */
    public String getId() {
        return id;
    }
    /** Metodo que devuelve el producto de la factura
     */
    public String getDesc() {
        return desc;
    }
    /** Metodo que devuelve la cantidad del producto de la factura
     */
    public int getQty() {
        return qty;
    }

    /** Metodo que cambia la cantidad del producto de la factura
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /** Metodo que devuelve el precio por unidad
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /** Metodo que cambia el precio por unidad
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /** Metodo que calcula el precio total del producto
     */
    public double getTotal() {
        return unitPrice*qty;   //se multiplica el precio de cada unidad por las unidades totales
    }

    /** Metodo que pasa a texto el artículo de la factura
     */
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}
