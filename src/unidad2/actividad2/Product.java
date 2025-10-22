package unidad2.actividad2;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return name + " - $" + price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

