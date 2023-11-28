import java.util.Scanner;

public class ManejoDeExcepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numerador:");
        int numerador = scanner.nextInt();

        System.out.println("Ingrese el denominador:");
        int denominador = scanner.nextInt();

        try {
            // Intentar realizar la división
            int resultado = dividir(numerador, denominador);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejar la excepción en caso de división por cero
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            // Este bloque se ejecuta siempre, independientemente de si se lanzó una
            // excepción o no
            System.out.println("Operación completada.");
            scanner.close();
        }
    }

    // Método que realiza la división y lanza una excepción si el denominador es
    // cero
    private static int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            // Lanzar una excepción si el denominador es cero
            throw new ArithmeticException("Intento de dividir por cero.");
        }
        return numerador / denominador;
    }
}
