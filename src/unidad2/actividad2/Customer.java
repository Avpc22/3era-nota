package unidad2.actividad2;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    
    private String name;
    private String email;
    private List<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
    }

    public String getInfo() {
        return "Customer: " + name + " (" + email + "), Orders: " + orders.size();
    }

    public List<Order> getOrders() {
        return orders;
    }
}

