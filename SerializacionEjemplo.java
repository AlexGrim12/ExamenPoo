import java.io.*;

// Clase que implementa Serializable
class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
}

public class SerializacionEjemplo {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Juan", 25);

        // Serialización: Guardar el objeto en un archivo
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("persona.ser"))) {
            salida.writeObject(persona);
            System.out.println("Objeto serializado y guardado en persona.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialización: Recuperar el objeto desde el archivo
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("persona.ser"))) {
            Persona personaDeserializada = (Persona) entrada.readObject();
            System.out.println("Objeto deserializado: " + personaDeserializada);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
