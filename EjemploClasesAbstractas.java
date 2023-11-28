// Definición de la clase abstracta Figura
abstract class Figura {
    abstract double calcularArea();
}

// Implementación de la clase abstracta en una clase concreta (Círculo)
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

// Implementación de la clase abstracta en otra clase concreta (Rectángulo)
class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }
}

public class EjemploClasesAbstractas {

    public static void main(String[] args) {
        // Crear instancias de las clases concretas
        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        // Calcular y mostrar áreas
        System.out.println("Area del círculo: " + circulo.calcularArea());
        System.out.println("Area del rectángulo: " + rectangulo.calcularArea());
    }
}
