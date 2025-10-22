package unidad2.actividad1;

public class Main {
    
    public static void main(String[] args) {
         Package p1 = new Package ("avpc22 " , 5.5);
         Package p2 = p1;
    p2.weight = 20.5;
    p1.showPackage();
    }
}
