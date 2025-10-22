package unidad2.actividad1;

public class Package {
        String trackingCode;
        double weight;
    
    public Package(String trackingCode, double weight) {
        this.trackingCode = trackingCode;
        this.weight = weight;
    }

    public void showPackage() {
        System.out.println("tracking code: " +trackingCode);
        System.out.println("weight: " +weight + " kilogramos");
    }
}
