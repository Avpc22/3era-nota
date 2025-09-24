import java.util.Scanner;

public class Product {
    String name;
    double price;
    int quantity;
    int amount;

    void register(Scanner scanner) {
        System.out.print("Enter product name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter product price: ");
        this.price = scanner.nextDouble();
        System.out.print("Enter product quantity: ");
        this.quantity = scanner.nextInt();

        System.out.println("Producto registrado:");
        System.out.println("Nombre: " + this.name);
        System.out.println("Precio: " + this.price);
        System.out.println("Cantidad: " + this.quantity);
    }

    void sell(Scanner scanner) {
        System.out.print("Enter product quantity to sell: ");
        this.amount = scanner.nextInt();
        if (this.quantity > this.amount) {
            this.quantity -= this.amount;
            this.price *= this.amount;
            System.out.println("vendido:" + amount + " | nuevo stock: " + this.quantity);
            System.out.println("total vendido: " + "$" +this.price);
        } else {
            System.out.println("cantidad insuficiente, solo hay: " + this.quantity + " en stock.");
        }
    }

    void newstock(Scanner scanner){
        System.out.print("Enter new stock quantity: ");
        this.amount = scanner.nextInt();

        this.quantity += this.amount;
        System.out.println("nuevo stock: " + this.quantity);

    }

}