package unidad2.actividad4;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addProduct(new Product("A01", "Keyboard", 25.99));
        inv.addProduct(new Product("A02", "Mouse", 15.50));
        inv.addProduct(new Product("A03", "Monitor", 180.00));

        
        inv.showProducts();

        System.out.println("\n🔎 Searching product by code...");

        Product p1 = inv.searchProduct("A02");
        if (p1 != null) {
            System.out.println("✅ Found: " + p1.getInfo());
        }

        Product p2 = inv.searchProduct("A99");
        if (p2 == null) {
            System.out.println("⚠️ Product not found.");
        }
    }
}
