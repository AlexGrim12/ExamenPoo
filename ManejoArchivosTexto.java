import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManejoArchivosTexto {

    public static void main(String[] args) {
        escribirArchivoTexto("archivo.txt", "Hola, esto es un ejemplo de escritura en un archivo de texto.");

        // Leer desde un archivo de texto
        String contenido = leerArchivoTexto("archivo.txt");
        System.out.println("Contenido del archivo de texto:\n" + contenido);
    }

    private static void escribirArchivoTexto(String nombreArchivo, String contenido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
            System.out.println("Se ha escrito en el archivo de texto.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String leerArchivoTexto(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenido.toString();
    }
}
