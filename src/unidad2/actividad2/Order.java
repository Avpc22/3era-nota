package unidad2.actividad2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private String date;
    private double total;
    private List<Product> products;

    public Order(String date) {
        this.date = date;
        this.products = new ArrayList<>();
        this.total = 0;
    }

    public void addProduct(Product p) {
        products.add(p);
        total += p.getPrice();
    }

    public String getInfo() {
        return "Order Date: " + date + ", Total: $" + total + ", Items: " + products.size();
    }

    public double getTotal() {
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }
}

