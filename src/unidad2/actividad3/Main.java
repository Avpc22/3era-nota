package unidad2.actividad3;

public class Main {
    public static void main(String[] args) {

        CarRental rental = new CarRental();

        rental.addCar(new Car("Toyota TXL", 50.0, true));
        rental.addCar(new Car("Montero mitsubishi", 60.0, false));
        rental.addCar(new Car("Ford Mustang", 120.0, true));
        rental.showAvailableCars();

        Car carFound = rental.searchCar("Ford Mustang");

        if (carFound != null) {
            int days = 3;
            double total = rental.calculateTotal(carFound, days);
            if (total > 0) {
                System.out.println("\nYou rented: " + carFound.getModel());
                System.out.println("Days: " + days);
                System.out.println("Total price: $" + total);
                // Mark car as not available now
                carFound.setAvailable(false);
            }
        }

        System.out.println("\nAfter rental:");
        rental.showAvailableCars();
    }
}
