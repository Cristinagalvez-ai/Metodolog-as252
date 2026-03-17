package matcomp.e1.ejerciciosclases.cuaderno3;

public class Cylinder4 {
    private Circle4 base; // Base circle, an instance of Circle class
    private double height;

    // Constructor with default color, radius and height
    public Cylinder4() {
        base = new Circle4(); // Call the constructor to construct the Circle
        height = 1.0;
    }
    public Cylinder4(double radius, double height) {
        base = new Circle4(radius);
        this.height = height;
    }
    public Cylinder4(double radius, String color, double height) {
        base = new Circle4(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getRadius() {
        return base.getRadius();
    }
    public void setRadius(double radius) {
        base.setRadius(radius);
    }
    public String getColor() {
        return base.getColor();
    }
    public void setColor(String color) {
        base.setColor(color);
    }
    public double getAreaBase() {
        return base.getArea();
    }
    public double getVolume() {
        return base.getArea()*height;
    }

    public String toString() {
        return "Cylinder[base=" + base + ",height=" + height + "]";
    }   //para este caso también es mejor usar composición, porque un cilindro está compuesto por un cículo como base y una altura, pero no es un círculo
}
