package semana4.PasePorReferencia;

public class Main {
    public void changeBox(Box newBox){
        newBox.size = 20;
        
    }
    public static void main(String[] args) {

        Box box = new Box(50);
        System.out.println("box size");
        changeBox(Box);
        System.out.println( box.size);

    }
}
