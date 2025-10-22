package unidad2.actividad3;

import java.util.ArrayList;

public class CarRental {
    private ArrayList<Car> cars;

    public CarRental() {
        cars = new ArrayList<>();
    }

    public void addCar(Car c) {
        cars.add(c);
    }

    public void showAvailableCars() {
        System.out.println("Available Cars:");
        for (Car c : cars) {
            if (c.isAvailable()) {
                System.out.println(" - " + c.getInfo());
            }
        }
    }

    public double calculateTotal(Car c, int days) {
        if (c.isAvailable()) {
            return c.getPricePerDay() * days;
        } else {
            System.out.println("Sorry, this car is not available.");
            return 0;
        }
    }
    
    public Car searchCar(String model) {
        for (Car c : cars) {
            if (c.getModel().equalsIgnoreCase(model)) {
                return c;
            }
        }
        System.out.println("Car not found.");
        return null;
    }
}
