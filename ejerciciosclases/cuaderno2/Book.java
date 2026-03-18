package matcomp.e1.ejerciciosclases.cuaderno2;

public class Book {
    // Atributos del libro, incluyendo un objeto de la clase Author
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;

    /** Constructor con cantidad por defecto (0) */
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 0;
    }

/** Constructor con todos los atributos incluyendo cantidad */
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

/** Metodos Getter para los atributos del libro */
    public String getIsbn() { return isbn; }
    public String getName() { return name; }
    public Author getAuthor() { return author; }
    public double getPrice() { return price; }
    public int getQty() { return qty; }

    /** Metodos Setter para precio y cantidad */
    public void setPrice(double price) { this.price = price; }
    public void setQty(int qty) { this.qty = qty; }

    /** Metodo que obtiene el nombre del autor desde el objeto Author */
    public String getAuthorName() { return author.getName(); }
    public String toString() {
        return "Book[isbn=" + isbn + ",name=" + name + ","
                + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }





}
