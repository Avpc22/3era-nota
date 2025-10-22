package semana4.crearObjetos;

public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }   

    public void showInfo() {
        System.out.println("la marca es  " + brand + ", del año: " + year);
    }
}
