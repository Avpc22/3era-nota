package unidad2.actividad4;

public class Product {
    private String code;
    private String name;
    private double price;

    // Constructor
    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String getInfo() {
        return "Code: " + code + ", Name: " + name + ", Price: $" + price;
    }
}
