package unidad3.books;

import java.io.BufferedWriter;       // Escribir texto en el archivo de forma eficiente
import java.io.BufferedReader;       // Leer texto línea por línea desde el archivo
import java.io.FileWriter;           // Crear o abrir un archivo para escritura
import java.io.FileReader;           // Abrir un archivo existente para lectura
import java.io.IOException;          // Manejar errores generales de entrada/salida
import java.io.FileNotFoundException;// Manejar error cuando el archivo no se encuentra

import java.util.List;               // Para manejar la lista de libros (List<Book>)

public class BookFileHandler {
    private static final String FILE_NAME = "books.txt";

    // 📗 Guarda todos los libros en el archivo
    public void saveBooks(List<Book> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Book b : books) {
                writer.write(b.getTitle() + "," + b.getAuthor() + "," + b.getPrice());
                writer.newLine(); // salto de línea
            }
            System.out.println("✅ Books successfully saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("❌ Error saving books: " + e.getMessage());
        } finally {
            System.out.println("📘 Operation finished (saveBooks).");
        }
    }

    // 📙 Lee todos los libros del archivo y los muestra en consola
    public void readBooks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("📖 Books from file:");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("Title: " + data[0] + ", Author: " + data[1] + ", Price: $" + data[2]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        } finally {
            System.out.println("📘 Operation finished (readBooks).");
        }
    }
}

