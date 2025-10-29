package unidad3.books;

import java.util.List; 
import java.util.ArrayList;       // Tipo de interfaz usada para el método saveBooks()

public class Main {
    public static void main(String[] args) {
        // Crear lista de libros
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 25.99));
        books.add(new Book("1984", "George Orwell", 19.50));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 22.00));

        // Crear el manejador de archivos
        BookFileHandler handler = new BookFileHandler();

        // Guardar los libros en el archivo
        handler.saveBooks(books);

        System.out.println(); // Línea en blanco

        // Leer los libros desde el archivo
        handler.readBooks();
    }
}
