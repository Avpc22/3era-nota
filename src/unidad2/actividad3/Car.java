package unidad2.actividad3;

public class Car {

    private String model;
    private double pricePerDay;
    private boolean available;

    public Car(String model, double pricePerDay, boolean available) {
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = available;
    }

    public String getModel() {
        return model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getInfo() {
        return model + " - $" + pricePerDay + "/day - " + 
               (available ? "Available" : "Not available");
    }
}

