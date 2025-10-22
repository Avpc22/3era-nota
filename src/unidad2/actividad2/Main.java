package unidad2.actividad2;

public class Main {

    public static void main(String[] args) {

        // categorias y productos
        Category electronics = new Category("Electronics", "Devices and gadgets");
        Product phone = new Product("Smartphone", 1500000);
        Product laptop = new Product("Laptop", 200000);
        electronics.addProduct(phone);
        electronics.addProduct(laptop);

        Customer john = new Customer("John Doe", "john@example.com");
        Order order1 = new Order("2025-10-20");
        order1.addProduct(phone);
        order1.addProduct(laptop);

        john.placeOrder(order1);

        
        System.out.println(electronics.getInfo());
        System.out.println("Products in category:");
        for (Product p : electronics.getProducts()) {
            System.out.println("  - " + p.getInfo());
        }

        System.out.println();
        System.out.println(john.getInfo());
        System.out.println(order1.getInfo());
        System.out.println("Items in order:");
        for (Product p : order1.getProducts()) {
            System.out.println("  - " + p.getInfo());
        }
    }
}


