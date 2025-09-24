import java.util.Scanner;

public class Main {
        
            public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);

            Product product = new Product();
            product.register(scanner);
            product.sell(scanner);
            product.newstock(scanner);

        }

}
