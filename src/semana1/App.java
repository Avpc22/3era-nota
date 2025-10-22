package semana1;

public class App {

    public static class BankAccount {
        // atributos
        String accountNumber;
        String owner;
        double balance;

        // Metodos
        void deposit(double amount) {
            balance += amount;
            System.out.println("Depósito exitoso. Nuevo balance: " + balance);
        }

        void withdraw(double amount) {
            if (amount >= amount) {
                balance -= amount;
                System.out.println("Retiro exitoso. Nuevo balance: " + balance);
            } else {
                System.out.println("Fondos insuficientes. No se puede retirar");
            }
        }
    
        void showBalance() {
            System.out.println("Su balance es: " + balance);
        }
    }

    public static void main(String[] args) throws Exception {
        BankAccount account1 = new BankAccount();
        account1.accountNumber = "1233-4355-0000-2786";
        account1.balance = 2000000;
        account1.owner = "Polo";
        System.out.println("Saldo Disponible: " + account1.balance);
        
        account1.deposit(1500000);
        
        System.out.println("N° de la cuenta: " + account1.accountNumber);
        System.out.println("Saldo Disponible: " + account1.balance);
        System.out.println("Nombre: " + account1.owner);
    }
}

