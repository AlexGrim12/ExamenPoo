interface Saludador {
    void saludar();
}

class SaludadorEnConsola implements Saludador {
    @Override
    public void saludar() {
        System.out.println("¡Hola, mundo!");
    }
}

public class EjemploInterfaces {

    public static void main(String[] args) {
        Saludador saludador = new SaludadorEnConsola();

        saludador.saludar();
    }
}
