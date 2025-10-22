package unidad2.actividad4;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    private ArrayList<Product> products;
    private HashMap<String, Product> catalog;

    public Inventory() {
        products = new ArrayList<>();
        catalog = new HashMap<>();
    }

    public void addProduct(Product p) {
        products.add(p);
        catalog.put(p.getCode(), p);
    }

    public void showProducts() {
        System.out.println("📦 Product list:");
        for (Product p : products) {
            System.out.println(p.getInfo());
        }
    }

    public Product searchProduct(String code) {
        try {
            Product found = catalog.get(code);
            if (found == null) {
                throw new Exception("❌ Product code not found: " + code);
            }
            return found;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}

