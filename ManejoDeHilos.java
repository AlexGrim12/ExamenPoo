class MiHilo extends Thread {
    private String mensaje;

    public MiHilo(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(mensaje);
            try {
                // Hacer que el hilo espere un tiempo aleatorio entre 100 y 500 milisegundos
                Thread.sleep((long) (Math.random() * 400 + 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ManejoDeHilos {

    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo("Hilo 1");
        MiHilo hilo2 = new MiHilo("Hilo 2");

        hilo1.start();
        hilo2.start();
    }
}
